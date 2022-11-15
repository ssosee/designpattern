package kr.ac.uos.designpattern.lecture.builder;

public class Client {
    public static void main(String[] args) {
        BoardBuilder build = new BoardImpl.Builder()
                .author("장세웅")
                .title("제목")
                .content("내용")
                .build();

        System.out.println(build);
    }
}
