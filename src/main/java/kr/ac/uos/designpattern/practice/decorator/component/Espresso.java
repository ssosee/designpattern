package kr.ac.uos.designpattern.practice.decorator.component;

import kr.ac.uos.designpattern.lecture.decorator.component.Beverage;

public class Espresso extends StarBeverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        if(getSize().equals(Size.TALL)) {
            return 2000;
        } else if (getSize().equals(Size.GRANDE)) {
            return 2500;
        }
        return 3000;
    }
}
