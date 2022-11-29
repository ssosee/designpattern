package kr.ac.uos.designpattern.lecture.decorator;

import kr.ac.uos.designpattern.lecture.decorator.component.Beverage;
import kr.ac.uos.designpattern.lecture.decorator.component.Espresso;
import kr.ac.uos.designpattern.lecture.decorator.component.HouseBlend;
import kr.ac.uos.designpattern.lecture.decorator.decorator.Mocha;
import kr.ac.uos.designpattern.lecture.decorator.decorator.Soy;

public class Starbucks {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1 = new Soy(beverage1);
        System.out.println("beverage = " + beverage1.getDescription()+" $"+beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println("beverage2 = " + beverage2.getDescription()+" $"+beverage2.cost());
    }
}
