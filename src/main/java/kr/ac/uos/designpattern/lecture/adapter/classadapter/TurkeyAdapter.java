package kr.ac.uos.designpattern.lecture.adapter.classadapter;

import kr.ac.uos.designpattern.lecture.adapter.classadapter.Duck;
import kr.ac.uos.designpattern.lecture.adapter.classadapter.WildTurkey;

public class TurkeyAdapter extends WildTurkey implements Duck {

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++) {
            super.fly();
        }
    }
}
