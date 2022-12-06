package kr.ac.uos.composition;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Lotto {
//    protected List<Integer> lottoNumbers; //자식 클래스까지 사용가능
//
//    public Lotto(List<Integer> lottoNumbers) {
//        this.lottoNumbers = lottoNumbers;
//    }
//
//    public boolean contains(Integer integer) {
//        return this.lottoNumbers.contains(integer);
//    }

    protected int[] lottoNumbers;

    public Lotto(int[] lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public boolean contains(Integer integer) {
        return Arrays.stream(lottoNumbers)
                .anyMatch(lottoNumber -> Objects.equals(lottoNumber, integer));
    }
}
