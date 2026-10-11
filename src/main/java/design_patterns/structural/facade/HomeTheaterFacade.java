package design_patterns.structural.facade;

public class HomeTheaterFacade {
    private Amplifier amp;
    private Projector projector;
    private DvdPlayer dvd;

    // The facade aggregates the complex subsystem elements
    public HomeTheaterFacade(Amplifier amp, Projector projector, DvdPlayer dvd) {
        this.amp = amp;
        this.projector = projector;
        this.dvd = dvd;
    }

    // A simple, unified method for the client
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amp.on();
        amp.setVolume(5);
        projector.on();
        dvd.on();
        dvd.play(movie);
    }

    // Another simple method to tear down the environment
    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        dvd.off();
        projector.off();
        amp.off();
    }
}
