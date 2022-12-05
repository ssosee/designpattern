package kr.ac.uos.designpattern.lecture.mediator;

import kr.ac.uos.designpattern.lecture.mediator.colleague.Colleague;
import kr.ac.uos.designpattern.lecture.mediator.colleague.ConcreteColleage;
import kr.ac.uos.designpattern.lecture.mediator.mediator.ConcreteMediator;
import kr.ac.uos.designpattern.lecture.mediator.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleage(mediator, "세웅");
        Colleague colleague2 = new ConcreteColleage(mediator, "신영");

        mediator.addUser(colleague1);
        mediator.addUser(colleague2);

        colleague1.send("일어나야지!");
        colleague2.send("하이!");
        colleague1.send("운동 가자!");
    }
}
