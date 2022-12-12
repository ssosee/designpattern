package kr.ac.uos.designpattern.practice2.iterator;

import java.util.Iterator;

public class MyStarBucksIterator implements Iterator<Item> {

    private Item[] items;
    private int position = 0;
    public MyStarBucksIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Item next() {
        Item item = items[position];
        position++;

        return item;
    }
}
