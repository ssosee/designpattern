package kr.ac.uos.designpattern.practice.adapter;

public class Client {
    public static void main(String[] args) {
        KakaoFirends ryan = new Ryan();
        LineFriends brown = new Brown();
        KakaoFirends brownAdapter = new BrownAdapter(brown);

        ryan.hello();
        ryan.action();

        System.out.println("=======================");

        brown.hi();
        brown.dance();

        System.out.println("=======================");

        brownAdapter.hello();
        brownAdapter.action();

        System.out.println("=======================");

        System.out.println("ryan instanceof KakaoFirends ? "+(ryan instanceof KakaoFirends));
        System.out.println("brown instanceof KakaoFirends ? "+(brown instanceof KakaoFirends));
        System.out.println("brownAdapter instanceof KakaoFirends ? "+(brownAdapter instanceof KakaoFirends));
    }
}
