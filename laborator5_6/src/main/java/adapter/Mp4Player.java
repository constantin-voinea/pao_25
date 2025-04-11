package adapter;

/**
 * @author cvoinea
 */
public class Mp4Player implements MultimediaPlayer {
    @Override
    public void playVlc(String numeFisier) {
        // neimplementat
    }

    @Override
    public void playMp4(String numeFisier) {
        System.out.println("Redare MP4 pentru fisierul: " + numeFisier);
    }
}
