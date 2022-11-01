package kr.ac.uos.designpattern.practice.strategy.attack;

public class AttackSpear implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("창으로 공격");
    }
}
