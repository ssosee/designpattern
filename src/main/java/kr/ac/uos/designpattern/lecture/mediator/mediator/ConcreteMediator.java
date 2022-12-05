package kr.ac.uos.designpattern.lecture.mediator.mediator;

import kr.ac.uos.designpattern.lecture.mediator.colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Colleague> colleagues = new ArrayList<>();
    @Override
    public void addUser(Colleague user) {
        colleagues.add(user);
    }

    @Override
    public void deleteUser(Colleague user) {
        colleagues.remove(user);
    }

    @Override
    public void sendMessage(String message, Colleague user) {
        for(Colleague c : colleagues) {
            if(c != user) {
                c.receive(message);
            }
        }
    }
}
