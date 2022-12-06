package kr.ac.uos.designpattern.lecture.bridge.abstraction;

import kr.ac.uos.designpattern.lecture.bridge.implementor.Drawing;

public class Circle extends Shape {

    private double x;
    private double y;
    private double r;

    public Circle(Drawing dp, double x, double y, double r) {
        super(dp);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        drawCircle(x, y, r);
    }
}
