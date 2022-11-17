package kr.ac.uos.designpattern.practice.iterator;

import kr.ac.uos.designpattern.practice.iterator.aggregate.Menu;
import kr.ac.uos.designpattern.practice.iterator.item.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waitress {
    List<Menu> menus = new ArrayList<>();

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for(Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<Item> iterator) {
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.print(item.getName()+", ");
            System.out.print(item.getDescription()+" -- ");
            System.out.println(item.getPrice()+"원");
        }
        System.out.println("==========  ===========  ==========  ==========  ==========  ========== ==========");
    }
}
