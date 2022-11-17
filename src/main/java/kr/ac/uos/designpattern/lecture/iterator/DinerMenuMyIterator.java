package kr.ac.uos.designpattern.lecture.iterator;

import java.util.Iterator;

public class DinerMenuMyIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems;
    int position = 0;

    public DinerMenuMyIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목은 지우면 안됩니다.");
    }
}
