package kr.ac.uos.designpattern.practice.prototype;

import kr.ac.uos.designpattern.lecture.command.receiver.Light;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private List<String> empList;

    public Employees() {
        this.empList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        empList.add("Kim");
        empList.add("Park");
        empList.add("Jang");
    }

    public List<String> getEmpList() {
        return empList;
    }

    public void add(String str) {
        System.out.println(str+" 추가");
        empList.add(str);
    }

    /**
     * 깊은 복사
     * 객체의 실제 값을 복사한다.(참조를 공유하지 않는다.)
     * clone() 메소드를 재정의하기 위해 Cloneable 인터페이스를 구현
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : empList) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
