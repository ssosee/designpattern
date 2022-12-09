package kr.ac.uos.designpattern.practice.bridge.abstraction;

import kr.ac.uos.designpattern.practice.bridge.implementor.WatchBand;

public abstract class AppleWatch {
    protected WatchBand watchBand;

    public abstract void changeBand(WatchBand watchBand);
}
