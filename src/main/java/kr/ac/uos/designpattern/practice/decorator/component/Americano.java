package kr.ac.uos.designpattern.practice.decorator.component;

import kr.ac.uos.designpattern.lecture.decorator.component.Beverage;

public class Americano extends StarBeverage {

    public Americano() {
        description = "아메리카노";
    }

    @Override
    public double cost() {
        if(getSize().equals(Size.TALL)) {
            return 2500;
        } else if (getSize().equals(Size.GRANDE)) {
            return 3000;
        }
        return 3500;
    }
}
