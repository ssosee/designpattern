package kr.ac.uos.designpattern.lecture.factory;

import kr.ac.uos.designpattern.lecture.factory.pizza.Pizza;

public abstract class PizzaStore {

    /**
     * 서브 클래스가 아닌 추상클래스에서 정의
     * 해당 메소드는 실제로 어떤 서브클래스에서 코드를 실행하고 피자를 만드는지 알수 없다.
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.pizzaName(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
