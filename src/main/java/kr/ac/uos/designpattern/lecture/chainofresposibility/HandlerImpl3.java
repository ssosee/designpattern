package kr.ac.uos.designpattern.lecture.chainofresposibility;

public class HandlerImpl3 extends Handler {

    @Override
    public void handleRequest(int request) {
        if(request < 30) {
            System.out.println("handler3 request = " + request);
        } else if (super.handler != null) {
            super.handler.handleRequest(request);
        }
    }
}
