package kr.ac.uos.designpattern.lecture.template.beverage;

public abstract class CaffeineBeverage {

    /**
     * 템플릿 메서드
     *
     * 1. prepareRecipe() 도 메서드
     * 2. 어떤 알고리즘의 템플릿(틀) 역할
     *  - 여기서는 카페인 음료를 만드는 알고리즘의 템플릿
     *
     *  메서드에 final 을 붙이면 override 를 제한
     *  상속 받은 클래스에서 해당 메서드를 수정해서 사용하지 못하도록 할 수 있는것이 메서드에 final을 붙이는 것
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public void boilWater() {
        System.out.println("물 끓이는 중");
    }
    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    /**
     * 서브 클래스에서 구현해야 하는 메서드
     */
    abstract void brew();
    abstract void addCondiments();
}
