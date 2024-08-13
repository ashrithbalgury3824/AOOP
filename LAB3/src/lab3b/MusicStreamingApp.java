package lab3b;

public class MusicStreamingApp {
    public static void main(String[] args) {
        
        MusicPlayer onlinePlayer = new OnlineStreamingAdapter(new OnlineStreamingMusicPlayer(), "The Nights -> streaming online");
      
        MusicPlayer equalizer = new EqualizerDecorator(onlinePlayer);
        equalizer.play();
        equalizer.pause();

        MusicPlayer radio = new RadioStationAdapter(new RadioStationPlayer(), "FM Radio is playing");
        MusicPlayer volumeControl = new VolumeControlDecorator(radio);
        volumeControl.play();
        volumeControl.pause();

        MusicPlayerBridge advancedPlayer = new AdvancedMusicPlayer(radio);
        advancedPlayer.play();
        advancedPlayer.stop();
    }
}