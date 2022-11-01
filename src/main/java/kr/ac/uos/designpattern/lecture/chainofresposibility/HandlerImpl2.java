package kr.ac.uos.designpattern.lecture.chainofresposibility;

public class HandlerImpl2 extends Handler {

    @Override
    public void handleRequest(int request) {
        if(request < 20) {
            System.out.println("handler2 request = " + request);
        } else if (super.handler != null) {
            super.handler.handleRequest(request);
        }
    }
}
