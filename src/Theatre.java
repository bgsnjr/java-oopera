import show.Ballet;
import show.Opera;
import show.Show;
import staff.*;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Василий", "Пупкин", Gender.MALE, 180);
        Actor actor2 = new Actor("Лолита", "Шишкина", Gender.FEMALE, 175);
        Actor actor3 = new Actor("Геннадий", "Лимонов", Gender.MALE, 170);

        Director director1 = new Director("Валентина", "Брук", Gender.FEMALE, 6);
        Director director2 = new Director("Ростислав", "Рысь", Gender.MALE, 4);

        MusicAuthor musicAuthor = new MusicAuthor("Борис", "Кукушкин", Gender.MALE);

        Choreographer choreographer = new Choreographer("Лариса", "Блинова", Gender.FEMALE);

        Show show = new Show(director1);
        Opera opera = new Opera(director1, musicAuthor, "ааааааааааааа", 10);
        Ballet ballet = new Ballet(director2, musicAuthor, "оооооооооооо", choreographer);

        show.addActor(actor1);
        show.addActor(actor3);
        opera.addActor(actor2);
        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println("Список актёров спектакля:");
        show.printActorsList();
        System.out.println("Список актёров оперы:");
        opera.printActorsList();
        System.out.println("Список актёров балета:");
        ballet.printActorsList();

        show.replaceActor(actor2, "Лимонов");
        System.out.println("Список актёров спектакля после изменения состава:");
        show.printActorsList();

        opera.replaceActor(actor1, "Прокофьева");
        System.out.println("Список актёров оперы:");
        opera.printActorsList();

        System.out.println("Текст либретто для оперы:");
        opera.printLibrettoText();
        System.out.println("Текст либретто для балета:");
        ballet.printLibrettoText();
    }
}
