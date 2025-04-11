package adapter;

/**
 * @author cvoinea
 */
public class VlcPlayer implements MultimediaPlayer {

    @Override
    public void playVlc(String numeFisier) {
        System.out.println("Redare Vlc pentru fisierul: " + numeFisier);
    }

    @Override
    public void playMp4(String numeFisier) {
        //
    }
}
