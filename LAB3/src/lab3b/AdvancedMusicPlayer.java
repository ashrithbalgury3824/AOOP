package lab3b;

public class AdvancedMusicPlayer extends MusicPlayerBridge {
    public AdvancedMusicPlayer(MusicPlayer musicPlayer) {
        super(musicPlayer);
        System.out.println("Advanced media player mode is on now");
    }

    @Override
    public void play() {
        musicPlayer.play();
    }

    @Override
    public void pause() {
        musicPlayer.pause();
    }

    @Override
    public void stop() {
        musicPlayer.stop();
    }
}