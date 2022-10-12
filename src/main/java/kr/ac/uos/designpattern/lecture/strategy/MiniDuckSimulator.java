package kr.ac.uos.designpattern.lecture.strategy;

import kr.ac.uos.designpattern.lecture.strategy.duck.ModelDuck;
import kr.ac.uos.designpattern.lecture.strategy.fly.FlyRocketPowered;
import kr.ac.uos.designpattern.lecture.strategy.duck.Duck;
import kr.ac.uos.designpattern.lecture.strategy.duck.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
