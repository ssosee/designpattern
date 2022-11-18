package kr.ac.uos.designpattern.lecture.iterator;

import kr.ac.uos.designpattern.lecture.iterator.composite.MenuComponent;
import lombok.Getter;

@Getter
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    @Override
    public void print() {
        System.out.print("  "+getName());
        if(isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.print(", "+getPrice());
        System.out.println("    -- "+getDescription());
    }
}
