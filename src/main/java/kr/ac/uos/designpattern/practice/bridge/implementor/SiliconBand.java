package kr.ac.uos.designpattern.practice.bridge.implementor;

public class SiliconBand implements WatchBand {

    private static final String name = "실리콘 밴드";

    @Override
    public String bandName() {
        return name;
    }
}
