package kr.ac.uos.designpattern.strategy;

import kr.ac.uos.designpattern.strategy.duck.Duck;
import kr.ac.uos.designpattern.strategy.duck.MallardDuck;
import kr.ac.uos.designpattern.strategy.duck.ModelDuck;
import kr.ac.uos.designpattern.strategy.fly.FlyRocketPowered;

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
