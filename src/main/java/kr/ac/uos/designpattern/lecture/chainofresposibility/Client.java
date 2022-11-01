package kr.ac.uos.designpattern.lecture.chainofresposibility;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new HandlerImpl1();
        Handler handler2 = new HandlerImpl2();
        Handler handler3 = new HandlerImpl3();

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        int[] request = {1, 3, 6, 33, 22, 39, 29, 11};
        for(int r : request) {
            handler1.handleRequest(r);
        }
    }
}
