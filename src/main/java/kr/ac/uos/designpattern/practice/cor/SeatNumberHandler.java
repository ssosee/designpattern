package kr.ac.uos.designpattern.practice.cor;

import java.util.Map;
import java.util.Random;

public class SeatNumberHandler extends MemberAuthenticationHandler {
    @Override
    public void handleRequest(String request) {
        if(request.contains("_1000")) {
            System.out.println("좌석 번호 = 1 ~ 10사이에 자유롭게 착성해주세요.");
        } else if(request.contains("_2000")) {
            System.out.println("좌석 번호 = 11 ~ 20사이에 자유롭게 착성해주세요.");
        } else if(request.contains("_3000")) {
            System.out.println("좌석 번호 = 21 ~ 30사이에 자유롭게 착성해주세요.");
        } else {
            System.out.println("좌석이 없습니다. 관리자에게 문의 하세요.");
        }
    }
}
