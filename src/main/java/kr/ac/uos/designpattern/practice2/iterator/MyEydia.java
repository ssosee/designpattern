package kr.ac.uos.designpattern.practice2.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyEydia implements MyMenu {

    private List<Item> items;

    public MyEydia() {
        this.items = new ArrayList<>();

        addItems("아아", "아아 입니다.", 1500);
        addItems("뜨아", "뜨아 입니다.", 1500);
    }

    private void addItems(String name, String desc, double price) {
        items.add(new Item(name, desc, price));
    }

    @Override
    public Iterator<Item> createIterator() {
        return items.iterator();
    }
}
