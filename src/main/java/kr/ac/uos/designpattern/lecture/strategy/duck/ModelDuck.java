package kr.ac.uos.designpattern.lecture.strategy.duck;

import kr.ac.uos.designpattern.lecture.strategy.quack.Quack;
import kr.ac.uos.designpattern.lecture.strategy.fly.FlyNoWay;

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
