package kr.ac.uos.designpattern.lecture.factory;

import kr.ac.uos.designpattern.lecture.factory.pizza.ChicagoPizzaStore;
import kr.ac.uos.designpattern.lecture.factory.pizza.NYStylePizzaStore;

public class Client {
    public static void main(String[] args) {
//        SimplePizzaFactory factory = new SimplePizzaFactory();
//
//        PizzaStore store1 = new PizzaStore(factory);
//        store1.orderPizza("cheese");
//
//        PizzaStore store2 = new PizzaStore(factory);
//        store2.orderPizza("greek");

        PizzaStore pizzaStore1 = new ChicagoPizzaStore();
        pizzaStore1.orderPizza("cheese");

        PizzaStore pizzaStore2 = new NYStylePizzaStore();
        pizzaStore2.orderPizza("cheese");

    }
}
