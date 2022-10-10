package kr.ac.uos.designpattern.observer.dto;

import lombok.Builder;
import lombok.ToString;

@ToString(of = {"title", "content", "writer"})
public class NewspaperDto {
    private String title;
    private String content;
    private String writer;

    @Builder
    public NewspaperDto(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}
