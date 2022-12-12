package kr.ac.uos.designpattern.practice2.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyWaiter {
    List<MyMenu> myMenus = new ArrayList<>();

    public MyWaiter(List<MyMenu> myMenus) {
        this.myMenus = myMenus;
    }

    public void printMenu() {
        for(MyMenu myMenu : myMenus) {
            printMenu(myMenu.createIterator());
        }
    }

    private void printMenu(Iterator<Item> iterator) {
        while (iterator.hasNext()) {
            Item item = iterator.next();
        }
    }
}
