package kr.ac.uos.designpattern.practice.factory.method.creator;

import kr.ac.uos.designpattern.practice.factory.method.product.Pizza;
import kr.ac.uos.designpattern.practice.factory.method.product.PizzaSchoolCheesePizza;
import kr.ac.uos.designpattern.practice.factory.method.product.PizzaSchoolPotatoPizza;

public class PizzaSchool extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("포테이토")) return new PizzaSchoolPotatoPizza();
        else if(type.equals("치즈")) return new PizzaSchoolCheesePizza();
        return new PizzaSchoolCheesePizza();
    }
}
