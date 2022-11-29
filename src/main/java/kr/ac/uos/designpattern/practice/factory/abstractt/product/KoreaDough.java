package kr.ac.uos.designpattern.practice.factory.abstractt.product;

public class KoreaDough implements Dough {

    public KoreaDough() {
        doughName();
    }

    @Override
    public void doughName() {
        System.out.println("한국 도우");
    }
}
