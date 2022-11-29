package kr.ac.uos.designpattern.practice.factory.abstractt.product;

public class CamembertCheese implements Cheese {

    public CamembertCheese() {
        cheeseName();
    }

    @Override
    public void cheeseName() {
        System.out.println("까망베르 치즈");
    }
}
