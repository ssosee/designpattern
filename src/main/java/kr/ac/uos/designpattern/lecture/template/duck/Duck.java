package kr.ac.uos.designpattern.lecture.template.duck;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class Duck implements Comparable<Duck> {

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    /**
     * 오리를 정렬하기 위해서 Arrays.sort()를 사용하면 되지만,
     * 오리 비교 방법은 compareTo() 메서드를 구현해야 한다.
     *
     * sort()를 모든 배열에서 사용하게 하기 위해서
     * 정적 메서드로 구현되어 있다.
     * 하지만, sort() 자체가 특정 슈퍼클래스에 정의 되어 있는 것이 아니므로
     * sort() 메서드가 여러분이 compareTo() 메서드를 구현했는지 알아낼 수 있는 방법이 필요하다.
     * 이러한 문제를 해결하기 위해서 Comparable<T>이 도입 되었다.
     *
     * 즉, sort()는 compareTo()의 결과를 이용해서 대소 관계를 리턴 한다.
     */
    @Override
    public int compareTo(Duck duck) {
        //무게를 기준으로 내림 차순으로 정렬
        if(this.weight < duck.weight) {
            return 1;
        } else if(this.weight == duck.weight) {
            return 0;
        } else {
            return -1;
        }
    }
}
