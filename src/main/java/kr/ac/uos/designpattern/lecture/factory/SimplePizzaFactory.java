package kr.ac.uos.designpattern.lecture.factory;

import kr.ac.uos.designpattern.lecture.factory.pizza.CheesePizza;
import kr.ac.uos.designpattern.lecture.factory.pizza.GreekPizza;
import kr.ac.uos.designpattern.lecture.factory.pizza.PepperoniPizza;
import kr.ac.uos.designpattern.lecture.factory.pizza.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("greek")) {
            pizza = new GreekPizza();
        } else if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
