package kr.ac.uos.designpattern.lecture.mediator.mediator;

import kr.ac.uos.designpattern.lecture.mediator.colleague.Colleague;

public interface Mediator {
    void addUser(Colleague user);
    void deleteUser(Colleague user);
    void sendMessage(String message, Colleague user);
}
