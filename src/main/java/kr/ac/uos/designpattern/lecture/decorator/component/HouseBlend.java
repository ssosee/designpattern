package kr.ac.uos.designpattern.lecture.decorator.component;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("하우스 블렌드 커피");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
