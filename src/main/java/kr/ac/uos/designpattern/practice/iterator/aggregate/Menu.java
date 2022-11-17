package kr.ac.uos.designpattern.practice.iterator.aggregate;

import kr.ac.uos.designpattern.practice.iterator.item.Item;

import java.util.Iterator;

public interface Menu {
    Iterator<Item> createIterator();
}
