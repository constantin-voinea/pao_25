package adapter;

/**
 * @author cvoinea
 */
public class Mp3Player implements MediaPlayer {

    private final AdaptorMedia adaptorMedia;

    public Mp3Player(AdaptorMedia adaptorMedia) {
        this.adaptorMedia = adaptorMedia;
    }

    @Override
    public void play(String format, String numeFisier) {
        if (format.equalsIgnoreCase("mp3")) {
            System.out.println("Redare fisier mp3: " + numeFisier);
        } else if (format.equalsIgnoreCase("vlc")
                || format.equalsIgnoreCase("mp4")) {

            adaptorMedia.play(format, numeFisier);
        } else {
            System.out.println("Format fisier nesuportat: " + format);
        }
    }
}
