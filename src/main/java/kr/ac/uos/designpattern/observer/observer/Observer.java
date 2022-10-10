package kr.ac.uos.designpattern.observer.observer;

import kr.ac.uos.designpattern.observer.dto.NewspaperDto;

public interface Observer {
    void update(NewspaperDto newspaperDto);
}
