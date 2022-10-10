package kr.ac.uos.designpattern.observer.observer;

import kr.ac.uos.designpattern.observer.dto.NewspaperDto;
import kr.ac.uos.designpattern.observer.subject.Newspaper;

public class Seaung implements Observer, Person {

    private NewspaperDto newspaperDto;
    private Newspaper newspaper;
    private static String NAME = "장세웅";

    public Seaung(Newspaper newspaper) {
        this.newspaper = newspaper;
    }

    @Override
    public void update(NewspaperDto newspaperDto) {
        this.newspaperDto = newspaperDto;
        status();
    }

    @Override
    public void status() {
        System.out.println("newspaperDto = " + newspaperDto+" "+NAME+"에게 전달 완료");
    }
}
