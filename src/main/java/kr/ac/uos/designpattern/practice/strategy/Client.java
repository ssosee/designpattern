package kr.ac.uos.designpattern.practice.strategy;

import kr.ac.uos.designpattern.practice.strategy.attack.AttackKnife;
import kr.ac.uos.designpattern.practice.strategy.attack.AttackSpear;

public class Client {
    public static void main(String[] args) {
        Soldier soldier1 = new GuanYu();
        Soldier soldier2 = new YuBi();

        soldier1.display();
        soldier1.attack();
        soldier1.setAttackBehavior(new AttackKnife()); // 전략 변경
        soldier1.attack();

        System.out.println("//========================//");

        soldier2.display();
        soldier2.attack();
        soldier2.setAttackBehavior(new AttackSpear()); //전략 변경
        soldier2.attack();
    }
}
