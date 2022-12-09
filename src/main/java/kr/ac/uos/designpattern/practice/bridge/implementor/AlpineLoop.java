package kr.ac.uos.designpattern.practice.bridge.implementor;

public class AlpineLoop implements WatchBand {

    private static final String name = "알파인 루프";

    @Override
    public String bandName() {
        return name;
    }
}
