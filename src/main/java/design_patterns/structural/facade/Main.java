package design_patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        // Instantiate the subsystem elements
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        DvdPlayer dvd = new DvdPlayer();

        // Pass them into the Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, projector, dvd);

        // The client only interacts with the Facade
        homeTheater.watchMovie("Inception");
        System.out.println("--- Movie Finished ---");
        homeTheater.endMovie();
    }
}
