package kr.ac.uos.designpattern.lecture.facade;

public class StremingPlayer extends Amplifier {

    private Amplifier amplifier;

    public StremingPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setStreamingPlayer() {

    }

    @Override
    public void setSurroundSound() {

    }
}
