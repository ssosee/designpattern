package kr.ac.uos.reflection;

import java.lang.reflect.Constructor;

/**
 * <a href="https://thisisnew-storage.tistory.com/10?category=815046">reflection 참고</a>
 */
public class GetReflectionTest {
    public static void main(String[] args) {
        // 방법 1
        Class refClass1 = ReflectionTest.class;

        // 방법 2
        ReflectionTest reflectionTest = new ReflectionTest();
        Class refClass2 = reflectionTest.getClass();

        try {
            // 방법 3
            Class refClass3 = Class.forName("kr.ac.uos.reflection.GetReflectionTest");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Constructor[] refConstructors = refClass1.getDeclaredConstructors();
        for(int i = 0; i < refConstructors.length; i++) {
            //private 생성자도 갖고 온다.
            System.out.println(refConstructors[i].toString());
        }
    }
}
