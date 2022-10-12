package kr.ac.uos.designpattern.lecture.observer.subject;

import kr.ac.uos.designpattern.lecture.observer.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
