package kr.ac.uos.designpattern.lecture.facade;

public class Projector extends StremingPlayer {
    public Projector(Amplifier amplifier) {
        super(amplifier);
    }

    public void tvMode() {

    }

    public void widScreenMode() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}