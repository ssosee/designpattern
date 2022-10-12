package kr.ac.uos.designpattern.practice.observer;

import kr.ac.uos.designpattern.practice.observer.observer.Seaung;
import kr.ac.uos.designpattern.practice.observer.dto.NewspaperDto;
import kr.ac.uos.designpattern.practice.observer.observer.Observer;
import kr.ac.uos.designpattern.practice.observer.observer.Shinyoung;
import kr.ac.uos.designpattern.practice.observer.subject.Newspaper;

public class Main {
    public static void main(String[] args) {

        Newspaper newspaper = new Newspaper();

        Observer seaung = new Seaung(newspaper);
        newspaper.changeNewspaperDto(new NewspaperDto("아이유 신곡 발표", "아이유가 정규 10집을 발표했다.", "박신영 기자"));

        Observer shinyoung = new Shinyoung(newspaper);
        newspaper.changeNewspaperDto(NewspaperDto.builder()
                        .title("아이유 신곡 발표 정정")
                        .content("아이유가 정규 9집을 발표 했다.")
                        .build());
    }
}
