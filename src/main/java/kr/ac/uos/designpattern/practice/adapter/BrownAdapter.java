package kr.ac.uos.designpattern.practice.adapter;

public class BrownAdapter implements KakaoFirends {

    private LineFriends lineFriends;

    public BrownAdapter(LineFriends lineFriends) {
        this.lineFriends = lineFriends;
    }

    @Override
    public void hello() {
        lineFriends.hi();
        System.out.println("아닙니다. 브..라이언 입니다.!");
    }

    @Override
    public void action() {
        lineFriends.dance();
        System.out.println("아닙니다. 브..라이언 입니다.!");
    }
}
