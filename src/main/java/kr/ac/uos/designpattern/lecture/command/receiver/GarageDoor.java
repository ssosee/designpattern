package kr.ac.uos.designpattern.lecture.command.receiver;

public class GarageDoor implements Device {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name+" 차고지 문이 열립니다.");
    }

    @Override
    public void off() {
        System.out.println(name+" 차고지 문이 닫힙니다.");
    }
}
