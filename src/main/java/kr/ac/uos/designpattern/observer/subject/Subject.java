package kr.ac.uos.designpattern.observer.subject;

import kr.ac.uos.designpattern.observer.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
