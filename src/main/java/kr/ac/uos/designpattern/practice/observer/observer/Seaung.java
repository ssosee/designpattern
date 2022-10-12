package kr.ac.uos.designpattern.practice.observer.observer;

import kr.ac.uos.designpattern.practice.observer.dto.NewspaperDto;
import kr.ac.uos.designpattern.practice.observer.subject.Newspaper;

public class Seaung implements Observer, Person {

    private NewspaperDto newspaperDto;
    private Newspaper newspaper;
    private static String NAME = "장세웅";

    public Seaung(Newspaper newspaper) {
        this.newspaper = newspaper;
        newspaper.registerObserver(this);
    }

    @Override
    public void update() {
        this.newspaperDto = newspaper.getNewspaperDto();
        status();
    }

    @Override
    public void status() {
        System.out.println("newspaperDto = " + newspaperDto+" "+NAME+"에게 전달 완료");
    }
}
