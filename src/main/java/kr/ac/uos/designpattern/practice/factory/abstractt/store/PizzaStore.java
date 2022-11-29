package kr.ac.uos.designpattern.practice.factory.abstractt.store;

import kr.ac.uos.designpattern.practice.factory.abstractt.pizza.Pizza;

public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
    }

    public abstract Pizza createPizza(String type);
}
