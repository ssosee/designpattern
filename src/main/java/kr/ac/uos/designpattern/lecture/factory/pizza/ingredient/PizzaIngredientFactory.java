package kr.ac.uos.designpattern.lecture.factory.pizza.ingredient;

import kr.ac.uos.designpattern.lecture.factory.pizza.Cheese;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createCalms();
}
