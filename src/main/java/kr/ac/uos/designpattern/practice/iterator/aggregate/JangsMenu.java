package kr.ac.uos.designpattern.practice.iterator.aggregate;

import kr.ac.uos.designpattern.practice.iterator.item.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JangsMenu implements Menu {
    private List<Item> items;

    public JangsMenu() {
        this.items = new ArrayList<>();

        addItems("장세웅의 시그니처 메뉴",
                "매일 바뀌는 메뉴 입니다.",
                10000);
    }

    private void addItems(String name, String description, double price) {
        items.add(new Item(name, description, price));
    }

    @Override
    public Iterator<Item> createIterator() {
        return items.iterator();
    }
}
