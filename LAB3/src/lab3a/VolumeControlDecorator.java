package lab3a;
class VolumeControlDecorator implements MusicPlayer {
    private MusicPlayer mp;
    private int volumeLevel;

    public VolumeControlDecorator(MusicPlayer mp) {
        this.mp = mp;
    }

    @Override
    public void play() {
        mp.play();
        System.out.println("Volume control is on");
    }

    @Override
    public void stop() {
        mp.stop();
    }

    @Override
    public void next() {
        mp.next();
    }

    @Override
    public void previous() {
        mp.previous();
    }

    public void setVolume(int level) {
        this.volumeLevel = level;
        System.out.println("Volume set to: " + volumeLevel);
    }
}