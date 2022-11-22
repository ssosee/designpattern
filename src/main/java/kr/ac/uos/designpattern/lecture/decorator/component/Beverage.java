package kr.ac.uos.designpattern.lecture.decorator.component;

public abstract class Beverage {
    private String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
