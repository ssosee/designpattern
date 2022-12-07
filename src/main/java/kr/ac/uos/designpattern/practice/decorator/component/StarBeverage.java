package kr.ac.uos.designpattern.practice.decorator.component;

public abstract class StarBeverage {
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    protected String description = "설명 없음";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
