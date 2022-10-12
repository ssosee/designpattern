package kr.ac.uos.designpattern.lecture.observer;

import kr.ac.uos.designpattern.lecture.observer.observer.CurrentDisplay;
import kr.ac.uos.designpattern.lecture.observer.observer.Observer;
import kr.ac.uos.designpattern.lecture.observer.observer.StatisticsDisplay;
import kr.ac.uos.designpattern.lecture.observer.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer display1 = new CurrentDisplay(weatherData);
        weatherData.setMeasurement(10f, 10f, 10f);
        Observer display2 = new StatisticsDisplay(weatherData);
        weatherData.setMeasurement(20f, 10f, 10f);
    }
}
