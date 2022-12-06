package kr.ac.uos.designpattern.lecture.bridge.implementor;

public class DP1 {

    public void draw_a_line(double x1, double y1, double x2, double y2) {
        System.out.println("DP1 => x1 = " + x1 + ", y1 = " + y1 + ", x2 = " + x2 + ", y2 = " + y2);
    }

    public void draw_a_circle(double x, double y, double r) {
        System.out.println("DP1 => x = " + x + ", y = " + y + ", r = " + r);
    }
}
