package kr.ac.uos.designpattern.lecture.observer.observer;

import kr.ac.uos.designpattern.lecture.observer.subject.Subject;
import kr.ac.uos.designpattern.lecture.observer.subject.WeatherData;

public class CurrentDisplay implements Observer, Display {

    private WeatherData weatherData;

    public CurrentDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + weatherData.getTemp()
                + "F degrees and " + weatherData.getHum() + "% humidity");
    }

    @Override
    public void update() {
        display();
    }
}
