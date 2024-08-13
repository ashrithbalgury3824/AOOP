package lab3a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicPlayerApp {
    public static void main(String[] args) {
        MusicPlayer mp;
        Scanner sc = new Scanner(System.in);
        List<String> playlist = new ArrayList<>();
        
        playlist.add("The Nights");
        playlist.add("Moral Of the Story");

        System.out.println("Enter the music player type (local or online):");
        String musicPlayerType = sc.nextLine();

        if (musicPlayerType.equalsIgnoreCase("local")) {
            LocalFileMusicPlayer localFileMusicPlayer = new LocalFileMusicPlayer(playlist);
            mp = new LocalFileAdapter(localFileMusicPlayer);
        } else {
            OnlineStreamingMusicPlayer onlineStreamingMusicPlayer = new OnlineStreamingMusicPlayer(playlist);
            mp = new OnlineStreamingAdapter(onlineStreamingMusicPlayer);
        }

        String str = "";
        while (!str.equalsIgnoreCase("exit")) {
            System.out.println("\nCommands: ");
            System.out.println("p - Play");
            System.out.println("s - Stop");
            System.out.println("n - Next Track");
            System.out.println("pr - Previous Track");
            System.out.println("v <level> - Set Volume (0->10)");
            System.out.println("exit - Exit player");
            System.out.print("Enter command: ");
            str = sc.nextLine();

            if (str.equalsIgnoreCase("p")) {
                mp.play();
            } else if (str.equalsIgnoreCase("s")) {
                mp.stop();
            } else if (str.equalsIgnoreCase("n")) {
                mp.next();
            } else if (str.equalsIgnoreCase("pr")) {
                mp.previous();
            } else if (str.startsWith("v")) {
                try {
                    int level = Integer.parseInt(str.split(" ")[1]);
                    if (level < 0 || level > 10) {
                        System.out.println("Volume level must be between 0 and 10.");
                    } else {
                        mp = new VolumeControlDecorator(mp);
                        ((VolumeControlDecorator) mp).setVolume(level);
                    }
                } catch (Exception e) {
                    System.out.println("Invalid volume level. Please enter a number between 0 and 10.");
                }
            } else if (!str.equalsIgnoreCase("exit")) {
                System.out.println("Unknown command. Please try again.");
            }
        }

        sc.close();
    }
}