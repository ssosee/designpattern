package kr.ac.uos.designpattern.practice.cor;

public class Client {
    public static void main(String[] args) {
        MemberAuthenticationHandler handler1 = new MemberIdHandler();
        MemberAuthenticationHandler handler2 = new DepartmentHandler();
        MemberAuthenticationHandler handler3 = new SeatNumberHandler();

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.handleRequest("dev1_100_1000");
        handler1.handleRequest("pm1_100_1000");
        handler1.handleRequest("dev2_100_2000");
        handler1.handleRequest("dev1_100_3000");
        handler1.handleRequest("dev1_100_4000");
    }
}
