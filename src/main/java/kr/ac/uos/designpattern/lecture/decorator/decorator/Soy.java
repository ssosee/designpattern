package kr.ac.uos.designpattern.lecture.decorator.decorator;

import kr.ac.uos.designpattern.lecture.decorator.component.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 두유";
    }
}
