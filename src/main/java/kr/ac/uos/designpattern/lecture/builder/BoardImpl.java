package kr.ac.uos.designpattern.lecture.builder;

import lombok.Builder;
import lombok.ToString;

@ToString(of = {"title", "content", "author"})
public class BoardImpl {
    private String title;
    private String content;
    private String author;

    public BoardImpl(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
    }

    public static class Builder implements BoardBuilder {
        private String title;
        private String content;
        private String author;

        @Override
        public BoardBuilder title(String title) {
            this.title = title;
            return this;
        }

        @Override
        public BoardBuilder content(String content) {
            this.content = content;
            return this;
        }

        @Override
        public BoardBuilder author(String author) {
            this.author = author;
            return this;
        }

        @Override
        public BoardBuilder build() {
            return this;
        }
    }
}
