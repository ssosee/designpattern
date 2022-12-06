package kr.ac.uos.designpattern.lecture.singleton;

public class DCLSingleton {
    //volatile는 Java 변수를 Main Memory에 저장
    private volatile static DCLSingleton uniqueInstance;

    /**
     * DCL(Double-Checked Locking)을 사용하면
     * 인스턴스가 생성되어 있는지 확인한 다음 생성되어 있지 않았을 때만 동기화할 수 있습니다.
     * 이러면 처음에만 동기화를 진행하고 나중에는 동기화 하지 않아도 됩니다.
     */
    public static DCLSingleton getInstance() {
        if (uniqueInstance == null) { //인스턴스가 있는지 확인하고, 없으면 동기화된 블록으로..
            synchronized (Singleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new DCLSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
