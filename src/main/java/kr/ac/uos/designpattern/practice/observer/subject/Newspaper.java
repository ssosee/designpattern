package kr.ac.uos.designpattern.practice.observer.subject;

import kr.ac.uos.designpattern.practice.observer.dto.NewspaperDto;
import kr.ac.uos.designpattern.practice.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Newspaper implements Subject {

    private NewspaperDto newspaperDto;
    private List<Observer> observers;

    public Newspaper() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : this.observers) {
            observer.update();
        }
    }

    public void changeNewspaperDto(NewspaperDto newspaperDto) {
        this.newspaperDto = newspaperDto;
        notifyObserver();
    }

    public NewspaperDto getNewspaperDto() {
        return this.newspaperDto;
    }
}
