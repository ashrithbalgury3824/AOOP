package lab6_v;

import java.util.LinkedList;

public class PlaylistManager {
    private LinkedList<String> songs;

    public PlaylistManager() {
        this.songs = new LinkedList<>();
    }

    public void addSong(String song) {
        songs.add(song);
        System.out.println("Song added: " + song);
    }

    public void removeSong(String song) {
        if (songs.contains(song)) {
            songs.remove(song);
            System.out.println("Song removed: " + song);
        } else {
            System.out.println("Song not found in the playlist.");
        }
    }

    public void moveSong(String song, int position) {
        if (songs.contains(song)) {
            String tempSong = song;
            songs.remove(song);
            
            if (position < 0 || position > songs.size()) {
                System.out.println("Invalid position. No changes made.");
                songs.addLast(tempSong);
                return;
            }
            
            songs.add(position, tempSong);
            System.out.println("Song moved to position " + position + ": " + tempSong);
        } else {
            System.out.println("Song not found in the playlist.");
        }
    }

    public void displaySongs() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        System.out.println("Playlist:");
        for (String song : songs) {
            System.out.println(song);
        }
    }
}
