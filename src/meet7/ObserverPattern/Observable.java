package meet7.ObserverPattern;

public interface Observable {
    void addObserver(Observer O);
    void removeObserver(Observer O);
    void notifyObserver();
}
