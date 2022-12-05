package kr.ac.uos.designpattern.practice.mediator.mediator;

import kr.ac.uos.designpattern.practice.mediator.colleague.AirPlane;

public interface AirController {

    void add(AirPlane airPlane);
    void delete(AirPlane airPlane);
    void send(String message, AirPlane fromPlane, AirPlane toPlane);
    void receive(String message, AirPlane airPlane);
    void sendAll(String message, AirPlane airPlane);
}
