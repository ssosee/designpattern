package kr.ac.uos.designpattern.lecture.strategy.duck;

import kr.ac.uos.designpattern.lecture.strategy.quack.Quack;
import kr.ac.uos.designpattern.lecture.strategy.fly.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}
