package kr.ac.uos.designpattern.lecture.bridge.implementor;

public class V1Drawing extends Drawing {

    private DP1 dp1 = new DP1();

    @Override
    public void drawLine(double x1, double y1, double x2, double y2) {
        dp1.draw_a_line(x1, y1, x2, y2);
    }

    @Override
    public void drawCircle(double x, double y, double r) {
        dp1.draw_a_circle(x, y, r);
    }
}
