package kr.ac.uos.designpattern.lecture.iterator;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
