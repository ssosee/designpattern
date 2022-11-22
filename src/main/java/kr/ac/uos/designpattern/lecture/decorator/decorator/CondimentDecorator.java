package kr.ac.uos.designpattern.lecture.decorator.decorator;

import kr.ac.uos.designpattern.lecture.decorator.component.Beverage;

/**
 * Beverage 객체가 들어갈 자리에 들어갈 수 있어야 하기 때문에,
 * Beverage 클래스를 확장한다.
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
