package lab3b;

public class LocalFileAdapter implements MusicPlayer {
    private LocalFileMusicPlayer localFileMusicPlayer;
    private String fileName;

    public LocalFileAdapter(LocalFileMusicPlayer localFileMusicPlayer, String fileName) {
        this.localFileMusicPlayer = localFileMusicPlayer;
        this.fileName = fileName;
    }

    public void play() {
        localFileMusicPlayer.playLocalFile(fileName);
    }

    public void pause() {
        localFileMusicPlayer.pauseLocalFile(fileName);
    }

    public void stop() {
        localFileMusicPlayer.stopLocalFile(fileName);
    }
}