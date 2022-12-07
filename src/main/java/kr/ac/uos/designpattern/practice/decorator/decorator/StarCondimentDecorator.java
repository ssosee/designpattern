package kr.ac.uos.designpattern.practice.decorator.decorator;

import kr.ac.uos.designpattern.practice.decorator.component.StarBeverage;

/**
 * extends StarBeverage 클래스를 확장 합니다.
 */
public abstract class StarCondimentDecorator extends StarBeverage {
    /**
     * StarBeverage 클래스 구성을 이용합니다.
     */
    protected StarBeverage startBeverage;
    public abstract String getDescription();
}
