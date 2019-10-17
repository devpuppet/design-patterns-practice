package facade;

import facade.model.*;

public class FacadeTest {

    public static void run() {

        DvdPlayer dvdPlayer = new DvdPlayer();
        Tuner tuner = new Tuner();
        Amplifier amplifier = new Amplifier(dvdPlayer, tuner);
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, popcornPopper, projector, screen);

        homeTheaterFacade.watchTV();

        homeTheaterFacade.stopWatchingTV();

    }

}
