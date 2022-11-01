package kr.ac.uos.designpattern.practice.strategy;

import kr.ac.uos.designpattern.practice.strategy.attack.AttackBehavior;
import kr.ac.uos.designpattern.practice.strategy.attack.AttackKnife;
import lombok.Setter;

abstract public class Soldier {
    AttackBehavior attackBehavior;
    public void attack() {
        attackBehavior.attack();
    }
    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        System.out.println("공격 방법 변경!");
    }
    abstract void display();

}
