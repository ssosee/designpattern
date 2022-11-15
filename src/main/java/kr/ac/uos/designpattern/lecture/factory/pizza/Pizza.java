package kr.ac.uos.designpattern.lecture.factory.pizza;

public abstract class Pizza {

    public void pizzaName(String type) {
        System.out.println("피자 이름="+type);
    }

    public void box() {
        System.out.println("피자 포장");
    }

    public void cut() {
        System.out.println("피자 자르기");
    }

    public void bake() {
        System.out.println("피자 굽기");
    }

    public void prepare() {
        System.out.println("피자 준비");
    }
}
