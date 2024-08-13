package lab3b;

public abstract class MusicDecorator implements MusicPlayer {
    protected MusicPlayer decoratedMusicPlayer;

    public MusicDecorator(MusicPlayer decoratedMusicPlayer) {
        this.decoratedMusicPlayer = decoratedMusicPlayer;
    }

    public void play() {
        decoratedMusicPlayer.play();
    }

    public void pause() {
        decoratedMusicPlayer.pause();
    }

    public void stop() {
        decoratedMusicPlayer.stop();
    }
}