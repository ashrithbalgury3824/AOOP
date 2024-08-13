package lab3a;

class OnlineStreamingAdapter implements MusicPlayer {
    private OnlineStreamingMusicPlayer onlineStreamingMusicPlayer;

    public OnlineStreamingAdapter(OnlineStreamingMusicPlayer onlineStreamingMusicPlayer) {
        this.onlineStreamingMusicPlayer = onlineStreamingMusicPlayer;
    }

    @Override
    public void play() {
        onlineStreamingMusicPlayer.playOnlineStream();
    }

    @Override
    public void stop() {
        onlineStreamingMusicPlayer.stopOnlineStream();
    }

    @Override
    public void next() {
        onlineStreamingMusicPlayer.nextTrack();
    }

    @Override
    public void previous() {
        onlineStreamingMusicPlayer.previousTrack();
    }
}