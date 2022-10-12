package kr.ac.uos.designpattern.lecture.observer.observer;

import kr.ac.uos.designpattern.lecture.observer.subject.Subject;
import kr.ac.uos.designpattern.lecture.observer.subject.WeatherData;

public class StatisticsDisplay implements Observer, Display {

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay="+weatherData.getHum()+"% hum");
    }
}
