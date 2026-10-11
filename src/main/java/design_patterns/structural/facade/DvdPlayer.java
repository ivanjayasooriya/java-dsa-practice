package design_patterns.structural.facade;

public class DvdPlayer {
    public void on() { System.out.println("DVD Player turned on."); }
    public void play(String movie) { System.out.println("Playing movie: " + movie); }
    public void off() { System.out.println("DVD Player turned off."); }
}
