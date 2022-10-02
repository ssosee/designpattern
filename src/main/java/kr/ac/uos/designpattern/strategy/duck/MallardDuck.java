package kr.ac.uos.designpattern.strategy.duck;

import kr.ac.uos.designpattern.strategy.fly.FlyWithWings;
import kr.ac.uos.designpattern.strategy.quack.Quack;

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
