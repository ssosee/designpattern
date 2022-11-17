package kr.ac.uos.designpattern.practice.iterator;

import kr.ac.uos.designpattern.practice.iterator.aggregate.JangsMenu;
import kr.ac.uos.designpattern.practice.iterator.aggregate.ShinsMenu;
import kr.ac.uos.designpattern.practice.iterator.aggregate.StarbucksMenu;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(
                List.of(new JangsMenu(),
                        new ShinsMenu(),
                        new StarbucksMenu()));

        waitress.printMenu();
    }
}
