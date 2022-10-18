package kr.ac.uos.designpattern.lecture.template.beverage;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }
}
