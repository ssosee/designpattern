package kr.ac.uos.designpattern.lecture.template.duck;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("duck1", 8),
                new Duck("duck2", 10),
                new Duck("duck3", 5)
        };

        System.out.println("정렬 전");
        display(ducks);

        /**
         * Arrays 클래스에 있는 sort() 템플릿 메소드를 호출
         * sort() 메서드 안에서
         * Comparable 인터페이스의 compareTo() 메서드에 의존합니다.
         *
         * 비교한 결과가 순서에 맞지 않으면 Arrays 에 들어있는 swap() 구상 메서드를 사용해서
         * 두 오리 객체를 맞바꿉니다.
         *
         * 이 과정을 반복합니다.
         */
        Arrays.sort(ducks);
        System.out.println("정렬 후");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
