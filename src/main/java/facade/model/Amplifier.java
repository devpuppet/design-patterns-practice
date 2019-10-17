package facade.model;

public class Amplifier {

    private DvdPlayer dvdPlayer;
    private Tuner tuner;

    public Amplifier(DvdPlayer dvdPlayer, Tuner tuner) {
        this.dvdPlayer = dvdPlayer;
        this.tuner = tuner;
    }

    public void turnOnDvdPlayer() {
        this.dvdPlayer.on();
    }

    public void turnOffDvdPlayer() {
        this.dvdPlayer.off();
    }

    public void turnOnTuner() {
        this.tuner.on();
    }

    public void turnOffTuner() {
        this.tuner.off();
    }

}
