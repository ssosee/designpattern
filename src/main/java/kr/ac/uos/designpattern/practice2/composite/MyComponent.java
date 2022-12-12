package kr.ac.uos.designpattern.practice2.composite;

public abstract class MyComponent {
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public String getPrice() {
        throw new UnsupportedOperationException();
    }

    public void add(MyComponent myComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MyComponent myComponent) {
        throw new UnsupportedOperationException();
    }

    public MyComponent getChild(int position) {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
