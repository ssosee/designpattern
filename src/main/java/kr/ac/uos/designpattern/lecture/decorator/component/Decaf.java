package kr.ac.uos.designpattern.lecture.decorator.component;

public class Decaf extends Beverage {

    public Decaf() {
        setDescription("๋์นดํ์ธ");
    }

    @Override
    public double cost() {
        return 2.29;
    }
}
