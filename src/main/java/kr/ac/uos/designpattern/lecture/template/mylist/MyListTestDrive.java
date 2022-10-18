package kr.ac.uos.designpattern.lecture.template.mylist;

import java.util.List;

public class MyListTestDrive {
    public static void main(String[] args) {
        String[] duck = {"duck1", "duck2", "duck3", "duck4"};
        MyStringList myStringList = new MyStringList(duck);

        /**
         * AbstractList 에는 get(), size() 추상 메서드에 의존하는
         * subList() 템플릿 메서드가 존재한다.
         */
        List duckSubList = myStringList.subList(0, 3);
        for (Object o : duckSubList) {
            System.out.println(o.toString());
        }
    }
}
