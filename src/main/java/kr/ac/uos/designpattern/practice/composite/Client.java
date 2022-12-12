package kr.ac.uos.designpattern.practice.composite;

import kr.ac.uos.designpattern.practice.composite.component.MyComponent;
import kr.ac.uos.designpattern.practice.composite.composite.MyComposite;
import kr.ac.uos.designpattern.practice.composite.leaf.MyLeaf;
import kr.ac.uos.designpattern.practice.iterator.composite.Waiter;

public class Client {
    public static void main(String[] args) {
        MyComponent myComponent1 = new MyComposite("장세웅1", "백영고등학교");
        MyComponent myComponent2 = new MyComposite("장세웅2", "한국산업기술대학교");
        MyComponent myComponent3 = new MyComposite("장세웅3", "서울시립대학원");
        MyComponent myComponent4 = new MyComposite("밍밍이", "경희대학원");

        MyComponent myComponent = new MyComposite("장세웅 집합!", "집합명령!");
        myComponent.add(myComponent1);
        myComponent.add(myComponent2);
        myComponent.add(myComponent3);

        myComponent1.add(new MyLeaf("출신 고등학교"));
        myComponent2.add(new MyLeaf("출신 대학교"));
        myComponent3.add(new MyLeaf("출신 대학원"));
        myComponent1.add(myComponent4);

        MyWaiter waiter = new MyWaiter(myComponent);
        waiter.print();

    }
}
