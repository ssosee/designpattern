package kr.ac.uos.designpattern.lecture.iterator;

import java.util.List;

public class MenuTestDrive {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(List.of(new CafeMenu(), new DinerMenu(), new PancakeHouseMenu()));
        waitress.printMenu();
    }
}
