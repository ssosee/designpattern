package kr.ac.uos.designpattern.lecture.adapter.objectadapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
