package kr.ac.uos.designpattern.practice.factory.abstractt.factory;

import kr.ac.uos.designpattern.practice.factory.abstractt.product.Cheese;
import kr.ac.uos.designpattern.practice.factory.abstractt.product.Dough;

public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
}
