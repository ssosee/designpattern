package kr.ac.uos.designpattern.practice.builder;


import lombok.Builder;

public class Member {
    private String name;
    private int age;
    private String password;
    private String address;

    @Builder //롬복 사용
    public Member(String name, int age, String password, String address) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.address = address;
    }
}
