package kr.ac.uos.designpattern.lecture.factory;

public class Client {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStore store1 = new PizzaStore(factory);
        store1.orderPizza("cheese");

        PizzaStore store2 = new PizzaStore(factory);
        store2.orderPizza("greek");
    }
}
