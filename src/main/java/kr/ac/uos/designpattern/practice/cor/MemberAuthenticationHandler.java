package kr.ac.uos.designpattern.practice.cor;

public abstract class MemberAuthenticationHandler {
    protected MemberAuthenticationHandler handler;

    public void setHandler(MemberAuthenticationHandler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(String request);
}
