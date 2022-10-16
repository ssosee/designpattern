package kr.ac.uos.designpattern.lecture.command.receiver;

public class CeilingFan implements Fan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    @Override
    public void on() {
        System.out.println(location+" 선풍기를 켭니다.");
    }

    @Override
    public void off() {
        speed = OFF;
        System.out.println(location+" 선풍기를 끕니다.");
    }

    @Override
    public void high() {
        speed = HIGH;
        System.out.println("선풍기 속도가 "+speed+"로 설정되었습니다.");
    }

    @Override
    public void medium() {
        speed = MEDIUM;
        System.out.println("선풍기 속도가 "+speed+"로 설정되었습니다.");
    }

    @Override
    public void low() {
        speed = LOW;
        System.out.println("선풍기 속도가 "+speed+"로 설정되었습니다.");
    }

    public int getSpeed() {
        return speed;
    }
}
