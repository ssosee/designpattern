package kr.ac.uos.designpattern.lecture.mediator.colleague;

import kr.ac.uos.designpattern.lecture.mediator.mediator.Mediator;

public class ConcreteColleage implements Colleague {

    private Mediator mediator;
    private String name;

    public ConcreteColleage(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + "님이 메시지를 보냈습니다. 메시지 내용: "+message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name+"님이 메시지를 받았습니다. 메시지 내용: "+ message);
    }
}
