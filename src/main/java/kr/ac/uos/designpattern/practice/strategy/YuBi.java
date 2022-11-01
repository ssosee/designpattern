package kr.ac.uos.designpattern.practice.strategy;

import kr.ac.uos.designpattern.practice.strategy.attack.AttackKnife;

public class YuBi extends Soldier {

    public YuBi() {
        attackBehavior = new AttackKnife();
    }

    @Override
    void display() {
        System.out.println("저는 유비입니다.");
    }
}
