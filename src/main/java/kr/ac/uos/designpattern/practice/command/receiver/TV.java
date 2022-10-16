package kr.ac.uos.designpattern.practice.command.receiver;

public class TV implements Device {

    private String name;

    public TV(String name) {
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
