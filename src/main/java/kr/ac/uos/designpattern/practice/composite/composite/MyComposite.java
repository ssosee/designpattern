package kr.ac.uos.designpattern.practice.composite.composite;

import kr.ac.uos.designpattern.practice.composite.component.MyComponent;

import java.util.ArrayList;
import java.util.List;

public class MyComposite extends MyComponent {

    public MyComposite(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private List<MyComponent> myComponents = new ArrayList<>();
    private String name;
    private String description;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void add(MyComponent myComponent) {
       this.myComponents.add(myComponent);
    }

    @Override
    public void remove(MyComponent myComponent) {
        this.myComponents.remove(myComponent);
    }

    @Override
    public MyComponent getChild(int index) {
        return this.myComponents.get(index);
    }

    @Override
    public void print() {
        System.out.println("name="+getName()+", description="+getDescription());

        for(MyComponent component : myComponents) {
            component.print();
        }
    }
}
