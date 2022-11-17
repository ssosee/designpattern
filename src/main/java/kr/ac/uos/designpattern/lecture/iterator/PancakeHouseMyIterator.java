package kr.ac.uos.designpattern.lecture.iterator;

import java.util.List;

public class PancakeHouseMyIterator implements MyIterator {

    private List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMyIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(menuItems.isEmpty() || position >= menuItems.size()) return false;
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    @Override
    public void remove() {

    }
}
