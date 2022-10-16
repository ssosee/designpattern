package kr.ac.uos.designpattern.practice.command.receiver;

public class Aircon implements Device {

    private String name;

    public Aircon(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name+"를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println(name+"를 끕니다.");
    }
}
