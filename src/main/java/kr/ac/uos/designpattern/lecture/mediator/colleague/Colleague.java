package kr.ac.uos.designpattern.lecture.mediator.colleague;

import kr.ac.uos.designpattern.lecture.mediator.mediator.Mediator;

public interface Colleague {
    void send(String message);
    void receive(String message);
}
