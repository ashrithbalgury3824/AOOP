package lab3a;

import java.util.List;

class LocalFileMusicPlayer {
    private List<String> playlist;
    private int currentTrack;

    public LocalFileMusicPlayer(List<String> playlist) {
        this.playlist = playlist;
        this.currentTrack = 0;
    }

    public void playLocalFile() {
        if (!playlist.isEmpty()) {
            System.out.println("Playing local file: " + playlist.get(currentTrack));
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void stopLocalFile() {
        System.out.println("Stopping local file: " + playlist.get(currentTrack));
    }

    public void nextTrack() {
        if (currentTrack < playlist.size() - 1) {
            currentTrack++;
            playLocalFile();
        } else {
            System.out.println("Reached the end of the playlist.");
        }
    }

    public void previousTrack() {
        if (currentTrack > 0) {
            currentTrack--;
            playLocalFile();
        } else {
            System.out.println("Already at the start of the playlist.");
        }
    }
}