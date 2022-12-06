package kr.ac.uos.designpattern.practice.builder;

import kr.ac.uos.designpattern.lecture.builder.BoardImpl;

public class Client {
    public static void main(String[] args) {
        CarrotBoard carrotBoard = CarrotBoard.builder()
                .title("2022 맥북프로(실버) 14")
                .price(2100000)
                .author("쿼카")
                .content("2022 맥북프로 14 팝니다.")
                .pictureName("맥북프로 사진")
                .build();

        System.out.println(carrotBoard);
    }
}
