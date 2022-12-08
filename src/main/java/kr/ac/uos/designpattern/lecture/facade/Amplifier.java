package kr.ac.uos.designpattern.lecture.facade;

public abstract class Amplifier {
    private Tuner tuner;
    private StremingPlayer player;

    abstract public void on();
    abstract public void off();
    abstract public void setStreamingPlayer();
    abstract public void setSurroundSound();
    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }
    public void setPlayer(StremingPlayer player) {
        this.player = player;
    }
}
