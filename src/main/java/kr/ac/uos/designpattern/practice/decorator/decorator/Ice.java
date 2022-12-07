package kr.ac.uos.designpattern.practice.decorator.decorator;

import kr.ac.uos.designpattern.practice.decorator.component.StarBeverage;

public class Ice extends StarCondimentDecorator {

    public Ice(StarBeverage startBeverage) {
        this.startBeverage = startBeverage;
    }

    @Override
    public double cost() {
        return this.startBeverage.cost() + 500;
    }

    @Override
    public String getDescription() {
        return this.startBeverage.getDescription() + ", 얼음";
    }
}
