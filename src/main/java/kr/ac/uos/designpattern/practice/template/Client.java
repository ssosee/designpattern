package kr.ac.uos.designpattern.practice.template;

public class Client {
    public static void main(String[] args) {
        CoffeeBeverage coffeeBeverage1 = new Americano();
        CoffeeBeverage coffeeBeverage2 = new Latte();

        coffeeBeverage1.createBeverage();

        System.out.println("//====================//");

        coffeeBeverage2.createBeverage();
    }
}
