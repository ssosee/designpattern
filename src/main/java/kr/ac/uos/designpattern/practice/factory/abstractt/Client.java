package kr.ac.uos.designpattern.practice.factory.abstractt;

import kr.ac.uos.designpattern.practice.factory.abstractt.factory.PizzaIngredientFactory;
import kr.ac.uos.designpattern.practice.factory.abstractt.store.PizzaHutStore;
import kr.ac.uos.designpattern.practice.factory.abstractt.store.PizzaSchoolStore;
import kr.ac.uos.designpattern.practice.factory.abstractt.store.PizzaStore;

public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore1 = new PizzaHutStore();
        pizzaStore1.orderPizza("cheese");

        System.out.println("============================");

        PizzaStore pizzaStore2 = new PizzaSchoolStore();
        pizzaStore2.orderPizza("cheese");
    }
}
