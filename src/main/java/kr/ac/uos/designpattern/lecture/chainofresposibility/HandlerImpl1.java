package kr.ac.uos.designpattern.lecture.chainofresposibility;

public class HandlerImpl1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if(request < 10) {
            System.out.println("handler1 request = " + request);
        } else if (super.handler != null) {
            super.handler.handleRequest(request);
        }
    }
}
