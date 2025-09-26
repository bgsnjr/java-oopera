package show;

import staff.Choreographer;
import staff.Director;
import staff.MusicAuthor;

public class Ballet extends MusicalShow {
    private Choreographer choreographer;

    public Ballet(Director director, MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
