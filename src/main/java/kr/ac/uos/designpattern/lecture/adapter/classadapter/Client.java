package kr.ac.uos.designpattern.lecture.adapter.classadapter;


public class Client {
    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter();
        duck.quack();
        duck.fly();
    }
}
