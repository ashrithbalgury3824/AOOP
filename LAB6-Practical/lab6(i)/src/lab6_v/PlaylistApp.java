package lab6_v;

public class PlaylistApp {
    public static void main(String[] args) {
        PlaylistManager playlist = new PlaylistManager();

        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");
        playlist.addSong("Song 4");
        playlist.addSong("Song 5");

        playlist.displaySongs();

        playlist.removeSong("Song 3");

        playlist.displaySongs();

        playlist.moveSong("Song 2", 4);

        playlist.displaySongs();
    }
}