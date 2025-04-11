package adapter;

/**
 * @author cvoinea
 */
public class AdaptorMedia implements MediaPlayer {
    MultimediaPlayer multimediaPlayer;

    public AdaptorMedia(String format) {
        if (format.equalsIgnoreCase("mp4")) {
            multimediaPlayer = new Mp4Player();
        } else if (format.equalsIgnoreCase("vlc")) {
            multimediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String format, String numeFisier) {
        if (format.equalsIgnoreCase("mp4")) {
            multimediaPlayer.playMp4(numeFisier);
        } else if (format.equalsIgnoreCase("vlc")) {
            multimediaPlayer.playVlc(numeFisier);
        }
    }
}
