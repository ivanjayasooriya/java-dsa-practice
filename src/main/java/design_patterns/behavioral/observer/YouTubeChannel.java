package design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private final List<Observer> subscribers = new ArrayList<>();
    private String latestVideoTitle;

    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(latestVideoTitle);
        }
    }

    // Business logic method that modifies state and triggers notification
    public void uploadVideo(String title) {
        this.latestVideoTitle = title;
        System.out.println("\n[Channel] Uploaded new video: " + title);
        notifyObservers(); // Automatically alert subscribers
    }
}
