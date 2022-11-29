package kr.ac.uos.designpattern.lecture.factory.pizza;

import kr.ac.uos.designpattern.lecture.factory.pizza.ingredient.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Pizza {

    private String name;
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private Veggies veggies;
    private Pepperoni pepperoni;
    private Clams clams;

    public abstract void prepare();

    public void pizzaName(String type) {
        System.out.println("피자 이름="+type+", "+name);
    }

    public void box() {
        System.out.println("피자 포장");
    }

    public void cut() {
        System.out.println("피자 자르기");
    }

    public void bake() {
        System.out.println("피자 굽기");
    }
}
