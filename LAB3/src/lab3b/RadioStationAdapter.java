package lab3b;

public class RadioStationAdapter implements MusicPlayer {
    private RadioStationPlayer radioStationPlayer;
    private String stationName;

    public RadioStationAdapter(RadioStationPlayer radioStationPlayer, String stationName) {
        this.radioStationPlayer = radioStationPlayer;
        this.stationName = stationName;
    }

    public void play() {
        radioStationPlayer.playRadio(stationName);
    }

    public void pause() {
        radioStationPlayer.pauseRadio(stationName);
    }

    public void stop() {
        radioStationPlayer.stopRadio(stationName);
    }
}