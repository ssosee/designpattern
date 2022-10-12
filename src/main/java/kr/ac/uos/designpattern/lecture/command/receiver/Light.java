package kr.ac.uos.designpattern.lecture.command.receiver;

public class Light implements Device {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name+" 조명을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println(name+" 조명을 끕니다.");
    }
}
