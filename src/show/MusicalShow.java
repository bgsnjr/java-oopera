package show;

import staff.Director;
import staff.MusicAuthor;

public class MusicalShow extends Show {
    private MusicAuthor musicAuthor;
    private String librettoText;

    public MusicalShow(Director director, MusicAuthor musicAuthor, String librettoText) {
        super(director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
