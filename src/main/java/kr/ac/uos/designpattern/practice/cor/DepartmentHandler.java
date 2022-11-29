package kr.ac.uos.designpattern.practice.cor;

public class DepartmentHandler extends MemberAuthenticationHandler {
    @Override
    public void handleRequest(String request) {
        if(request.contains("dev1")) {
            System.out.println("개발1팀 입니다.");
            super.handler.handleRequest(request);
        } else if (request.contains("dev2")) {
            System.out.println("개발2팀 입니다.");
            super.handler.handleRequest(request);
        } else if (request.contains("dev3")) {
            System.out.println("개발3팀 입니다.");
            super.handler.handleRequest(request);
        } else {
            System.out.println("개발팀 소속이 아닙니다.");
        }
    }
}
