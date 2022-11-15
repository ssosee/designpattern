package kr.ac.uos.designpattern.lecture.builder;

public interface BoardBuilder {
    BoardBuilder title(String title);
    BoardBuilder content(String content);
    BoardBuilder author(String author);
    BoardBuilder build();
}
