package facade;

import facade.model.*;

public class HomeTheaterFacade {

    private Amplifier amplifier;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(Amplifier amplifier,
                             PopcornPopper popcornPopper,
                             Projector projector,
                             Screen screen) {
        this.amplifier = amplifier;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchTV() {
        System.out.println("\n--- START TV MODE ---");
        popcornPopper.on();
        popcornPopper.pop();
        screen.up();
        projector.on();
        projector.tvMode();
        projector.wideScreenMode();
        amplifier.turnOnTuner();

    }

    public void stopWatchingTV() {
        System.out.println("\n--- STOP TV MODE ---");
        amplifier.turnOffTuner();
        projector.off();
        screen.down();
        popcornPopper.off();
    }

}
