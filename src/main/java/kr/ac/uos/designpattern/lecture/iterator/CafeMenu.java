package kr.ac.uos.designpattern.lecture.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    private Map<String, MenuItem> menuItemMap = new HashMap<>();

    public CafeMenu() {

        addItem("아이스 아메리카노",
                "시원한 아이스 아메리카노",
                true,
                2.49);

        addItem("허니 브레드",
                "달콤한 허니 브레드",
                true,
                3.49);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItemMap.put(name, menuItem);
    }
    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItemMap.values().iterator();
    }
}
