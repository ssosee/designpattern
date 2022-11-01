package kr.ac.uos.designpattern.practice.template;

public abstract class CoffeeBeverage {

    //템플릿 메소드
    final void createBeverage() {
        choiceMenu();
        if(!hotOrIce()) {
            pourIce();
        }
        boilWater();
        pourInCup();
    }

    abstract void choiceMenu();

    boolean hotOrIce() {
        return true;
    }

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    private void pourIce() {
        System.out.println("얼음이 나오는중");
    }
}
