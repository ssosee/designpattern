package kr.ac.uos.designpattern.practice2.builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("wkd")
                .age(1)
                .build();
    }
}
