package kr.ac.uos.designpattern.practice.iterator.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuComposite extends MenuComponent {

    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public MenuComposite(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int position) {
        return menuComponents.get(position);
    }

    @Override
    public void print() {
        System.out.print("\n"+ getName());
        System.out.println(", "+getDescription());
        System.out.println("----------------------");

        for(MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
