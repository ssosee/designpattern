package kr.ac.uos.designpattern.practice.factory.abstractt.factory;

import kr.ac.uos.designpattern.practice.factory.abstractt.product.CamembertCheese;
import kr.ac.uos.designpattern.practice.factory.abstractt.product.Cheese;
import kr.ac.uos.designpattern.practice.factory.abstractt.product.Dough;
import kr.ac.uos.designpattern.practice.factory.abstractt.product.KoreaDough;

public class PizzaHutIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new KoreaDough();
    }

    @Override
    public Cheese createCheese() {
        return new CamembertCheese();
    }
}
