package show;

import staff.Director;
import staff.MusicAuthor;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(Director director, MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
