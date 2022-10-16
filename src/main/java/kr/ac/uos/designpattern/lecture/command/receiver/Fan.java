package kr.ac.uos.designpattern.lecture.command.receiver;

public interface Fan extends Device {
    void high();
    void medium();
    void low();
    int getSpeed();
}
