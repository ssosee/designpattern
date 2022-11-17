package kr.ac.uos.designpattern.practice.iterator.aggregate;

import kr.ac.uos.designpattern.practice.iterator.item.Item;

import java.util.Iterator;

public class StarbucksMenu implements Menu {
    private final int MAX_ITEMS = 6;
    private int numOfItems = 0;
    private Item[] items;

    public StarbucksMenu() {
        items = new Item[MAX_ITEMS];

        addItems("아이스 아메리카노",
                "디카페인",
                4800);

        addItems("아이스 아메리카노",
                "카페인",
                4500);

    }

    private void addItems(String name, String description, double price) {
        Item item = new Item(name, description, price);
        if(numOfItems >= MAX_ITEMS) {
            throw new RuntimeException("죄송합니다. 메뉴가 가득 찼습니다.");
        } else {
            items[numOfItems] = item;
            numOfItems++;
        }
    }

    @Override
    public Iterator<Item> createIterator() {
        return new StarbucksMenuIterator(items);
    }
}
