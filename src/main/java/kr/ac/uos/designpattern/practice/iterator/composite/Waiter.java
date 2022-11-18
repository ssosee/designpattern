package kr.ac.uos.designpattern.practice.iterator.composite;

public class Waiter {
    private MenuComponent allMenus;

    public Waiter(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print() {
        allMenus.print();
    }
}
