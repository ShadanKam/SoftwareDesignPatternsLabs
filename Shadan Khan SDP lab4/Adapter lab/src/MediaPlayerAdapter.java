public class MediaPlayerAdapter implements AdvancedMediaPlayer {
    MediaPlayer player;

    public MediaPlayerAdapter(MediaPlayer newPlayer) {
        player = newPlayer;
    }

    public void playMp3(String fileName) {
        player.play("Mp3", fileName);
    }

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }

}
