package kr.ac.uos.designpattern.practice2.composite;

import java.util.ArrayList;
import java.util.List;

public class MyComposite extends MyComponent {

    private List<MyComponent> myComponents = new ArrayList<>();
    private String name;
    private String description;

    public MyComposite(String name, String description) {
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
    public void add(MyComponent myComponent) {
        this.myComponents.add(myComponent);
    }

    @Override
    public void remove(MyComponent myComponent) {
        this.myComponents.remove(myComponent);
    }

    @Override
    public MyComponent getChild(int position) {
        return myComponents.get(position);
    }


}
