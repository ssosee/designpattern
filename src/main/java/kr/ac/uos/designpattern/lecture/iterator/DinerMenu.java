package kr.ac.uos.designpattern.lecture.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItems("스테이크",
                "맛잇는 스테이크",
                true,
                5.99);

        addItems("샐러드",
                "맛잇는 샐러드",
                true,
                3.49);

        addItems("파스타",
                "맛잇는 파스타",
                true,
                4.19);
    }

    public void addItems(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numOfItems >= MAX_ITEMS) {
            System.out.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        } else {
            menuItems[numOfItems] = menuItem;
            numOfItems = numOfItems + 1;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuMyIterator(menuItems);
    }
}
