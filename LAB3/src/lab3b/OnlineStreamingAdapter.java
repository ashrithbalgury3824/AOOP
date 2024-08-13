package lab3b;

public class OnlineStreamingAdapter implements MusicPlayer {
    private OnlineStreamingMusicPlayer onlineStreamingMusicPlayer;
    private String fileName;

    public OnlineStreamingAdapter(OnlineStreamingMusicPlayer onlineStreamingMusicPlayer, String fileName) {
        this.onlineStreamingMusicPlayer = onlineStreamingMusicPlayer;
        this.fileName = fileName;
    }

    public void play() {
        onlineStreamingMusicPlayer.playOnlineStream(fileName);
    }

    public void pause() {
        onlineStreamingMusicPlayer.pauseOnlineStream(fileName);
    }

    public void stop() {
        onlineStreamingMusicPlayer.stopOnlineStream(fileName);
    }
}