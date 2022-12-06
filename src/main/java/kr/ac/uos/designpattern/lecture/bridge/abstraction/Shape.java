package kr.ac.uos.designpattern.lecture.bridge.abstraction;

import kr.ac.uos.designpattern.lecture.bridge.implementor.Drawing;

public abstract class Shape {
    public abstract void draw();
    private Drawing _dp;

    public Shape(Drawing _dp) {
        this._dp = _dp;
    }
    public void drawLine(double x1, double y1, double x2, double y2) {
        _dp.drawLine(x1, y1, x2, y2);
    }
    public void drawCircle(double x, double y, double r) {
        _dp.drawCircle(x, y, r);
    }
}
