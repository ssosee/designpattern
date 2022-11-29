package kr.ac.uos.designpattern.practice.factory.abstractt.pizza;

import kr.ac.uos.designpattern.practice.factory.abstractt.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("피자 재료 선택!");
        setCheese(ingredientFactory.createCheese());
        setDough(ingredientFactory.createDough());
    }
}
