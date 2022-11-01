package kr.ac.uos.designpattern.lecture.chainofresposibility;

abstract public class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(int request);
}
