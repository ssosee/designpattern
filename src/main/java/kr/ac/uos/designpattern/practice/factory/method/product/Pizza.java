package kr.ac.uos.designpattern.practice.factory.method.product;

public abstract class Pizza {
    private String storeName;
    private String name;

    public void initPizza(String storeName, String name) {
        this.storeName = storeName;
        this.name = name;
    }

    public void hello() {
        System.out.println(storeName+" 입니다.");
    }

    public void prepare() {
        System.out.println(name+" 상품을 준비 합니다.");
    }

    public void finish() {
        System.out.println("끝!");
    }
}
