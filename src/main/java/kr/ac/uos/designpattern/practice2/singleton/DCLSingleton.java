package kr.ac.uos.designpattern.practice2.singleton;

public class DCLSingleton {
    private volatile static DCLSingleton dclSingleton;

    public static DCLSingleton getInstance() {
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if(dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}
