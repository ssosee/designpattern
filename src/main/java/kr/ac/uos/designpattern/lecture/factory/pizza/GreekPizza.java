package kr.ac.uos.designpattern.lecture.factory.pizza;

import kr.ac.uos.designpattern.lecture.factory.pizza.ingredient.PizzaIngredientFactory;

public class GreekPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public GreekPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비중: "+getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setClams(ingredientFactory.createCalms());
    }
}
