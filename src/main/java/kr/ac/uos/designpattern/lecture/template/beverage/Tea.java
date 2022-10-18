package kr.ac.uos.designpattern.lecture.template.beverage;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬은 추가하는 중");
    }
}
