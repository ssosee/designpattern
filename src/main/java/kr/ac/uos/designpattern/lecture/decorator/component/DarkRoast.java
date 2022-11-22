package kr.ac.uos.designpattern.lecture.decorator.component;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("다크로스팅 커피");
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
