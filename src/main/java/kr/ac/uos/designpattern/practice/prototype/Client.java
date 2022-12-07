package kr.ac.uos.designpattern.practice.prototype;

import java.util.List;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees deepCopy = (Employees) emps.clone();
        Employees shallowCopy = emps;

        System.out.println("original = "+emps.getEmpList()+", "+emps);
        deepCopy.add("깊은 밍밍이");
        shallowCopy.add("얇은 싱싱이");

        System.out.println("original = "+emps.getEmpList()+", "+emps);
        System.out.println("deepCopy = "+deepCopy.getEmpList()+", "+deepCopy);
        System.out.println("shallowCopy = "+shallowCopy.getEmpList()+", "+shallowCopy);
    }
}
