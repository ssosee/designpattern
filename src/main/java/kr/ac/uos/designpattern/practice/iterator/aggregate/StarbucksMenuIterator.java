package kr.ac.uos.designpattern.practice.iterator.aggregate;

import kr.ac.uos.designpattern.practice.iterator.item.Item;

import java.util.Iterator;

public class StarbucksMenuIterator implements Iterator<Item> {

    private Item[] items;
    private int position = 0;

    public StarbucksMenuIterator(Item[] items) {
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
