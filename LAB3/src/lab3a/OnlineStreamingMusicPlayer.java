package lab3a;

import java.util.List;

class OnlineStreamingMusicPlayer {
    private List<String> playlist;
    private int currentTrack;

    public OnlineStreamingMusicPlayer(List<String> playlist) {
        this.playlist = playlist;
        this.currentTrack = 0;
    }

    public void playOnlineStream() {
        if (!playlist.isEmpty()) {
            System.out.println("Playing online file: " + playlist.get(currentTrack));
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void stopOnlineStream() {
        System.out.println("Stopping online file: " + playlist.get(currentTrack));
    }

    public void nextTrack() {
        if (currentTrack < playlist.size() - 1) {
            currentTrack++;
            playOnlineStream();
        } else {
            System.out.println("Reached the end of the playlist.");
        }
    }

    public void previousTrack() {
        if (currentTrack > 0) {
            currentTrack--;
            playOnlineStream();
        } else {
            System.out.println("Already at the start of the playlist.");
        }
    }
}