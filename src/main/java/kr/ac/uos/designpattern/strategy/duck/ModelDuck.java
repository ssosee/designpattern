package kr.ac.uos.designpattern.strategy.duck;

import kr.ac.uos.designpattern.strategy.fly.FlyNoWay;
import kr.ac.uos.designpattern.strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
