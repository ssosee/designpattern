package kr.ac.uos.designpattern.lecture.singleton;

public class ClassicSingleton {
    //정적 변수
    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {
    }

    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            //게으른 인스턴스 생성(LazyInstantiation)
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }
}