package kr.ac.uos.designpattern.lecture.command.receiver;

public class StereoImpl implements Stereo {

    private String name;

    public StereoImpl(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name+" 스테레오를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println(name+" 스테레오를 끕니다.");
    }

    @Override
    public void setCd() {
        System.out.println(name+" CD를 재생합니다.");
    }

    @Override
    public void setDvd() {
        System.out.println(name+" DVD를 재생합니다.");
    }

    @Override
    public void setRadio() {
        System.out.println(name+" 라디오로 설정합니다.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println(name+" 스테레오 볼륨을 " + volume+"으로 설정합니다.");
    }
}
