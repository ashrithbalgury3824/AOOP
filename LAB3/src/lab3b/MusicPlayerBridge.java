package lab3b;

public abstract class MusicPlayerBridge {
    protected MusicPlayer musicPlayer;

    protected MusicPlayerBridge(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public abstract void play();
    public abstract void stop();
    public abstract void pause();
}
