package kr.ac.uos.designpattern.practice.bridge;

import kr.ac.uos.designpattern.practice.bridge.abstraction.AppleWatch;
import kr.ac.uos.designpattern.practice.bridge.abstraction.Se2;
import kr.ac.uos.designpattern.practice.bridge.abstraction.Series8;
import kr.ac.uos.designpattern.practice.bridge.implementor.AlpineLoop;
import kr.ac.uos.designpattern.practice.bridge.implementor.SiliconBand;
import kr.ac.uos.designpattern.practice.bridge.implementor.WatchBand;

public class Client {
    public static void main(String[] args) {
        WatchBand alpineLoop = new AlpineLoop();
        WatchBand siliconBand = new SiliconBand();
        AppleWatch MyappleWatch = new Series8();
        AppleWatch YourappleWatch = new Se2();

        YourappleWatch.changeBand(alpineLoop);
        MyappleWatch.changeBand(siliconBand);

        YourappleWatch.changeBand(siliconBand);
        MyappleWatch.changeBand(alpineLoop);
    }
}
