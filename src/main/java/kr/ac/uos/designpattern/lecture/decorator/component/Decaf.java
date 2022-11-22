package kr.ac.uos.designpattern.lecture.decorator.component;

public class Decaf extends Beverage {

    public Decaf() {
        setDescription("디카페인");
    }

    @Override
    public double cost() {
        return 2.29;
    }
}
