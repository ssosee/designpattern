package kr.ac.uos.designpattern.practice.decorator;

import kr.ac.uos.designpattern.practice.decorator.component.Americano;
import kr.ac.uos.designpattern.practice.decorator.component.Espresso;
import kr.ac.uos.designpattern.practice.decorator.component.StarBeverage;
import kr.ac.uos.designpattern.practice.decorator.decorator.Ice;
import kr.ac.uos.designpattern.practice.decorator.decorator.Whip;

public class Client {
    public static void main(String[] args) {
        StarBeverage beverage1 = new Espresso();
        beverage1.setSize(StarBeverage.Size.VENTI);
        System.out.println("첫번째 주문 = "+beverage1.getDescription()+" :: 가격 = "+beverage1.cost());

        StarBeverage beverage2 = new Americano();
        beverage2.setSize(StarBeverage.Size.GRANDE);
        beverage2 = new Ice(beverage2);
        System.out.println("두번째 주문 = " + beverage2.getDescription()+" :: 가격 = "+beverage2.cost());

        StarBeverage beverage3 = new Americano();
        beverage3.setSize(StarBeverage.Size.TALL);
        beverage3 = new Ice(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println("세번째 주문 = " + beverage3.getDescription()+" :: 가격 = "+beverage3.cost());
    }
}
