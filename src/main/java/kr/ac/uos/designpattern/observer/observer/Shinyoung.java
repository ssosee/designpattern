package kr.ac.uos.designpattern.observer.observer;

import kr.ac.uos.designpattern.observer.dto.NewspaperDto;
import kr.ac.uos.designpattern.observer.subject.Newspaper;

public class Shinyoung implements Observer, Person {

    private Newspaper newspaper;
    private NewspaperDto newspaperDto;
    private String NAME = "박신영";

    public Shinyoung(Newspaper newspaper) {
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
