package kr.ac.uos.designpattern.practice.adapter;

public class Ryan implements KakaoFirends {

    @Override
    public void hello() {
        System.out.println("나는 라이언 입니다.");
    }

    @Override
    public void action() {
        System.out.println("라이언은 따봉을 했습니다.");
    }
}
