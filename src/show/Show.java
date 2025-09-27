package show;

import staff.Actor;
import staff.Director;

import java.util.ArrayList;

public class Show {
    protected ArrayList<Actor> actors = new ArrayList<>();
    protected Director director;

    public Show(Director director) {
        this.director = director;
    }

    public void printActorsList() {
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (actors.contains(actor)) {
            System.out.println("Данный актёр уже присутствует в списке!");
        } else actors.add(actor);
    }

    public void replaceActor(Actor newActor, String replacedActorSurname) {
        ArrayList<Actor> foundActors = new ArrayList<>();
        int foundIndex = -1;
        for (int i = 0; i < actors.size(); i++) {
            if (actors.get(i).getSurname().equals(replacedActorSurname)) {
                foundActors.add(actors.get(i));
                foundIndex = i;
            }
        }
        if (foundActors.isEmpty()) {
            System.out.printf("Актёр с фамилией %s отсутствует в списке!\n", replacedActorSurname);
        } else if (foundActors.size() > 1) {
            System.out.printf("Актёр с фамилией %s встречается в списке несколько раз!\n", replacedActorSurname);
        } else {
            actors.set(foundIndex, newActor);
        }
    }
}
