package kr.ac.uos.designpattern.observer;

import kr.ac.uos.designpattern.observer.dto.NewspaperDto;
import kr.ac.uos.designpattern.observer.observer.Observer;
import kr.ac.uos.designpattern.observer.observer.Seaung;
import kr.ac.uos.designpattern.observer.observer.Shinyoung;
import kr.ac.uos.designpattern.observer.subject.Newspaper;

public class Main {
    public static void main(String[] args) {

        Newspaper newspaper = new Newspaper();

        Observer seaung = new Seaung(newspaper);
        Observer shinyoung = new Shinyoung(newspaper);

        //옵저버 등록
        newspaper.registerObserver(seaung);

        newspaper.changeNewspaperDto(new NewspaperDto("아이유 신곡 발표", "아이유가 정규 10집을 발표했다.", "박신영 기자"));

        //옵저버 등록
        newspaper.registerObserver(shinyoung);

        newspaper.changeNewspaperDto(new NewspaperDto("아이유 신곡 발표 정정", "아이유가 정규 9집을 발표했다.", "장세웅 기자"));
    }
}
