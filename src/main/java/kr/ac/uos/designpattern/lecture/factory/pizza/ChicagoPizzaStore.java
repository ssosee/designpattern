package kr.ac.uos.designpattern.lecture.factory.pizza;

import kr.ac.uos.designpattern.lecture.factory.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")) return new ChicagoCheesePizza();
        else if(type.equals("pepperoni")) return new ChicagoPepperoniPizza();
        return null;
    }
}
