package kr.ac.uos.designpattern.lecture.observer.subject;

import kr.ac.uos.designpattern.lecture.observer.observer.Observer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float hum;
    private float press;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers) {
            o.update();
        }
    }

    public void setMeasurement(float temp, float hum, float press) {
        this.temp = temp;
        this.hum = hum;
        this.press = press;
        notifyObserver();
    }
}
