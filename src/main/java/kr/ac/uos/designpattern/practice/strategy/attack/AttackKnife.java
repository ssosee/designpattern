package kr.ac.uos.designpattern.practice.strategy.attack;

public class AttackKnife implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("칼로 공격!");
    }
}
