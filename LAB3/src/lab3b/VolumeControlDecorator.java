package lab3b;

public class VolumeControlDecorator extends MusicDecorator {
    public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    public void play() {
        super.play();
        System.out.println("Volume control is on");
    }
}