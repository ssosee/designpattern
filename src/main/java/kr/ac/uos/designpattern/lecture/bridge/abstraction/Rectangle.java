package kr.ac.uos.designpattern.lecture.bridge.abstraction;

import kr.ac.uos.designpattern.lecture.bridge.implementor.Drawing;

public class Rectangle extends Shape {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Rectangle(Drawing dp, double x1, double x2, double y1, double y2) {
        super(dp);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        drawLine(x1, y1, x2, y1);
        drawLine(x2, y1, x2, y2);
        drawLine(x2, y2, x1, y2);
        drawLine(x1, y2, x1, y1);
    }
}
