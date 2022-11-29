package kr.ac.uos.designpattern.practice.factory.method.creator;

import kr.ac.uos.designpattern.practice.factory.method.product.Pizza;
import kr.ac.uos.designpattern.practice.factory.method.product.PizzaHutCheese;
import kr.ac.uos.designpattern.practice.factory.method.product.PizzaHutPotato;

public class PizzaHut extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("포테이토")) return new PizzaHutPotato();
        else if(type.equals("치크")) return new PizzaHutCheese();
        return new PizzaHutCheese();
    }
}
