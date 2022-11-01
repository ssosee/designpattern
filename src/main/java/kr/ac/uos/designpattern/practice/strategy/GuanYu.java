package kr.ac.uos.designpattern.practice.strategy;

import kr.ac.uos.designpattern.practice.strategy.attack.AttackBehavior;
import kr.ac.uos.designpattern.practice.strategy.attack.AttackSpear;
import lombok.Setter;


public class GuanYu extends Soldier {

    public GuanYu() {
        attackBehavior = new AttackSpear();
    }

    @Override
    void display() {
        System.out.println("저는 관우 입니다.");
    }
}
