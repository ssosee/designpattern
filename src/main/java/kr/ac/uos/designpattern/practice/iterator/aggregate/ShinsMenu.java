package kr.ac.uos.designpattern.practice.iterator.aggregate;

import kr.ac.uos.designpattern.practice.iterator.item.Item;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShinsMenu implements Menu {

    private Map<String, Item> map;

    public ShinsMenu() {
        this.map = new HashMap<>();

        addItems("신영이의 뚝딱 한끼 메뉴",
                "가성비 식사 메뉴 입니다.",
                8000);

        addItems("신영이의 고급 한끼 메뉴",
                "고급 재료로 만드는 식사 메뉴 입니다.",
                25000);

        addItems("신영이의 특별한 날 메뉴",
                "특별한 날을 위해 신영이가 엄선한 재료로 만드는 식사 메뉴 입니다.",
                45000);
    }

    private void addItems(String name, String description, double price) {
        map.put(name, new Item(name, description, price));
    }

    @Override
    public Iterator<Item> createIterator() {
        return map.values().iterator();
    }
}
