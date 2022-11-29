package kr.ac.uos.designpattern.practice.factory.abstractt.factory;

import kr.ac.uos.designpattern.practice.factory.abstractt.product.Cheese;
import kr.ac.uos.designpattern.practice.factory.abstractt.product.Dough;
import kr.ac.uos.designpattern.practice.factory.abstractt.product.MozzarellaCheese;
import kr.ac.uos.designpattern.practice.factory.abstractt.product.USADough;

public class PizzaSchoolIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new USADough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
