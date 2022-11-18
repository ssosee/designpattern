package kr.ac.uos.designpattern.lecture.iterator;

import kr.ac.uos.designpattern.lecture.iterator.composite.MenuComponent;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName()+", ");
            System.out.print(menuItem.getPrice()+"--");
            System.out.println(menuItem.getDescription());
        }
    }
}
