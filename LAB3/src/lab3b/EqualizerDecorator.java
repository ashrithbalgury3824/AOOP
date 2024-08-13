package lab3b;

public class EqualizerDecorator extends MusicDecorator {
    public EqualizerDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    public void play() {
        super.play();
        System.out.println("Equalizer is on");
    }
}