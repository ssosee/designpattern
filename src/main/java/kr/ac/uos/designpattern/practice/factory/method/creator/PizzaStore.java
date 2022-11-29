package kr.ac.uos.designpattern.practice.factory.method.creator;

import kr.ac.uos.designpattern.practice.factory.method.product.Pizza;

public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.hello();
        pizza.prepare();
        pizza.finish();
    }

    public abstract Pizza createPizza(String type);
}
