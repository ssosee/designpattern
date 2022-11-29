package kr.ac.uos.designpattern.practice.factory.abstractt.store;

import kr.ac.uos.designpattern.practice.factory.abstractt.factory.PizzaIngredientFactory;
import kr.ac.uos.designpattern.practice.factory.abstractt.factory.PizzaSchoolIngredientFactory;
import kr.ac.uos.designpattern.practice.factory.abstractt.pizza.CheesePizza;
import kr.ac.uos.designpattern.practice.factory.abstractt.pizza.Pizza;

public class PizzaSchoolStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        System.out.println("안녕하세요. 피자스쿨 입니다.");
        PizzaIngredientFactory ingredientFactory = new PizzaSchoolIngredientFactory();

        if(type.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        }

        return null;
    }
}
