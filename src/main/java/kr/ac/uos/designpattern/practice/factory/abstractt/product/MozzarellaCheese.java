package kr.ac.uos.designpattern.practice.factory.abstractt.product;

public class MozzarellaCheese implements Cheese {

    public MozzarellaCheese() {
        cheeseName();
    }

    @Override
    public void cheeseName() {
        System.out.println("모짜렐라 치즈");
    }
}
