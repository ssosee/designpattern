package kr.ac.uos.designpattern.practice.bridge.abstraction;

import kr.ac.uos.designpattern.practice.bridge.implementor.WatchBand;

public class Se2 extends AppleWatch {

    private static final String name = "se2";

    @Override
    public void changeBand(WatchBand watchBand) {
        this.watchBand = watchBand;
        System.out.println(name+" "+this.watchBand.bandName()+"로 밴드 변경합니다.");
    }
}
