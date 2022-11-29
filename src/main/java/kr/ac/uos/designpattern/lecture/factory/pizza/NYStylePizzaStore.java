package kr.ac.uos.designpattern.lecture.factory.pizza;

import kr.ac.uos.designpattern.lecture.factory.PizzaStore;
import kr.ac.uos.designpattern.lecture.factory.pizza.ingredient.NYPizzaIngredientFactory;
import kr.ac.uos.designpattern.lecture.factory.pizza.ingredient.PizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")) return new CheesePizza(ingredientFactory);
        else if(type.equals("greek")) return new GreekPizza(ingredientFactory);
        return null;
    }
}
