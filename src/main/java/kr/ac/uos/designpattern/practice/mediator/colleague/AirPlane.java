package kr.ac.uos.designpattern.practice.mediator.colleague;

public interface AirPlane {
    void send(String message);
    void receive(String message);
    String getName();
}
