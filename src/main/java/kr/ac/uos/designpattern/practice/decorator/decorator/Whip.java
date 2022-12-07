package kr.ac.uos.designpattern.practice.decorator.decorator;

import kr.ac.uos.designpattern.practice.decorator.component.StarBeverage;

public class Whip extends StarCondimentDecorator {

    public Whip(StarBeverage starBeverage) {
        this.startBeverage = starBeverage;
    }

    @Override
    public double cost() {
        if (getSize().equals(Size.TALL)) {
            return this.startBeverage.cost() + 300;
        } else if (getSize().equals(Size.GRANDE)) {
            return this.startBeverage.cost() + 500;
        }
        return this.startBeverage.cost() + 700;
    }

    @Override
    public String getDescription() {
        return this.startBeverage.getDescription() + ", 휘핑 크림";
    }
}
