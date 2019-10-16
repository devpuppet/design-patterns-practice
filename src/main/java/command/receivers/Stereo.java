package command.receivers;

public class Stereo extends Receiver {

    private int volume;

    public Stereo(String name) {
        super(name);
    }

    public void setCD() {
        System.out.println(String.format("[%s] CD mode has been set", getName()));
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(String.format("[%s] set Volume: %s", getName(), volume));
    }

}
