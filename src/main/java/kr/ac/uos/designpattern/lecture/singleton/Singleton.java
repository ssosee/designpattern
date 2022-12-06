package kr.ac.uos.designpattern.lecture.singleton;

public class Singleton {
    //정적 초기화 부분에서 인스턴스 생성, 이러면 멀티스레드 환경에서도 별문제가 없다.
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
