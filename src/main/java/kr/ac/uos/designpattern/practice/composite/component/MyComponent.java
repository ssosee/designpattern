package kr.ac.uos.designpattern.practice.composite.component;

import kr.ac.uos.designpattern.lecture.iterator.composite.MenuComponent;

public abstract class MyComponent {
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public void add(MyComponent myComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MyComponent myComponent) {
        throw new UnsupportedOperationException();
    }
    public MyComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
