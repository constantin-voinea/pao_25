package adapter;

/**
 * @author cvoinea
 */
public class Test {

    public static void main(String[] args) {

        AdaptorMedia adaptorMp4 = new AdaptorMedia("mp4");
        Mp3Player player1 = new Mp3Player(adaptorMp4);
        player1.play("mP3", "fisier audio mp3");
        player1.play("Mp4", "fisier mp4");
        player1.play("VLC", "fisier vlc");

        AdaptorMedia adaptorVlc = new AdaptorMedia("vlc");
        Mp3Player player2 = new Mp3Player(adaptorVlc);
        player2.play("mP3", "fisier audio mp3");
        player2.play("Mp4", "fisier mp4");
        player2.play("VLC", "fisier vlc");

    }
}
