package kr.ac.uos.designpattern.practice.factory.abstractt.product;

public class USADough implements Dough {

    public USADough() {
        doughName();
    }

    @Override
    public void doughName() {
        System.out.println("미국 도우");
    }
}
