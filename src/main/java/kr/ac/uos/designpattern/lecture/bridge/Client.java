package kr.ac.uos.designpattern.lecture.bridge;

import kr.ac.uos.designpattern.lecture.bridge.abstraction.Circle;
import kr.ac.uos.designpattern.lecture.bridge.abstraction.Rectangle;
import kr.ac.uos.designpattern.lecture.bridge.abstraction.Shape;
import kr.ac.uos.designpattern.lecture.bridge.implementor.Drawing;
import kr.ac.uos.designpattern.lecture.bridge.implementor.V1Drawing;
import kr.ac.uos.designpattern.lecture.bridge.implementor.V2Drawing;

public class Client {
    public static void main(String[] args) {
        Shape r1, r2;
        Drawing dp;

        dp = new V1Drawing();
        r1 = new Rectangle(dp, 1, 1, 2, 2);

        dp = new V2Drawing();
        r2 = new Circle(dp, 2, 2, 3);

        r1.draw();
        r2.draw();
    }
}
