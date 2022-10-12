package kr.ac.uos.designpattern.practice.observer.subject;

import kr.ac.uos.designpattern.practice.observer.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
