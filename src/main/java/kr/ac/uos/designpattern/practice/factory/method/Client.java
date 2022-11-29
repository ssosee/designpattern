package kr.ac.uos.designpattern.practice.factory.method;

import kr.ac.uos.designpattern.practice.factory.method.creator.PizzaHut;
import kr.ac.uos.designpattern.practice.factory.method.creator.PizzaSchool;
import kr.ac.uos.designpattern.practice.factory.method.creator.PizzaStore;

public class Client {
    public static void main(String[] args) {
        System.out.println("신영이: 아 피자헛 포테이토피자 먹고 싶다!");
        PizzaStore pizzaStore = new PizzaHut();
        pizzaStore.orderPizza("포테이토");

        System.out.println("--------------------------------");

        System.out.println("신영이: 아 피자스쿨 치즈피자 먹고 싶다!");
        pizzaStore = new PizzaSchool();
        pizzaStore.orderPizza("치즈");
    }
}
