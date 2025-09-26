package show;

import staff.Actor;
import staff.Director;

import java.util.ArrayList;

public class Show {
    private ArrayList<Actor> actors = new ArrayList<>();
    private Director director;

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
        boolean found = false;
        for (int i = 0; i < actors.size(); i++) {
            if (actors.get(i).getSurname().equals(replacedActorSurname)) {
                found = true;
                actors.set(i, newActor);
            }
        }
        if (!found) {
            System.out.printf("Актёр с фамилией %s отсутствует в списке!\n", replacedActorSurname);
        }
    }
}
