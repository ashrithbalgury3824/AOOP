package lab3a;

class LocalFileAdapter implements MusicPlayer {
    private LocalFileMusicPlayer localFileMusicPlayer;

    public LocalFileAdapter(LocalFileMusicPlayer localFileMusicPlayer) {
        this.localFileMusicPlayer = localFileMusicPlayer;
    }

    @Override
    public void play() {
        localFileMusicPlayer.playLocalFile();
    }

    @Override
    public void stop() {
        localFileMusicPlayer.stopLocalFile();
    }

    @Override
    public void next() {
        localFileMusicPlayer.nextTrack();
    }

    @Override
    public void previous() {
        localFileMusicPlayer.previousTrack();
    }
}