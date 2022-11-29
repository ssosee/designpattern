package kr.ac.uos.designpattern.practice.cor;

public class MemberIdHandler extends MemberAuthenticationHandler {
    @Override
    public void handleRequest(String request) {
        System.out.println("=========================");
        if(request.contains("_100_")) {
            System.out.println("회원 인증 완료");
            super.handler.handleRequest(request);
        } else {
            System.out.println("회원 등록을 해주세요.");
        }
    }
}
