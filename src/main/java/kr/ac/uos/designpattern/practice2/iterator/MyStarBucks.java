package kr.ac.uos.designpattern.practice2.iterator;

import java.util.Iterator;

public class MyStarBucks implements MyMenu {
    private final int MAX_ITEMS = 6;
    private int numOfItems = 0;
    private Item[] items;

    public MyStarBucks() {
        items = new Item[MAX_ITEMS];

        addItems("아아", "아아입니다.", 1000);
        addItems("뜨아", "뜨아입니다.", 1000);
    }

    private void addItems(String name, String desc, double price) {
        Item item = new Item(name, desc, price);
        if(numOfItems >= MAX_ITEMS) {
            throw new RuntimeException("sorry");
        } else {
            items[numOfItems] = item;
            numOfItems++;
        }
    }

    @Override
    public Iterator<Item> createIterator() {
        return new MyStarBucksIterator(items);
    }
}
