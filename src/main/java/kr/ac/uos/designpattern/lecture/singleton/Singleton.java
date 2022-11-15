package kr.ac.uos.designpattern.lecture.singleton;

public class Singleton {
    public Singleton() {
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
