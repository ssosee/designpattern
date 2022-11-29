package kr.ac.uos.designpattern.practice.composite;

import kr.ac.uos.designpattern.practice.composite.component.MyComponent;

public class MyWaiter {
    private MyComponent myComponent;

    public MyWaiter(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    public void print() {
        this.myComponent.print();
    }
}
