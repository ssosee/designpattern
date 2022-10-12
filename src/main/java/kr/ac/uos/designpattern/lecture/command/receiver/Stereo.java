package kr.ac.uos.designpattern.lecture.command.receiver;

public interface Stereo extends Device {
    void setCd();
    void setDvd();
    void setRadio();
    void setVolume(int volume);
}
