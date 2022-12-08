package kr.ac.uos.designpattern.practice.adapter;

public class Brown implements LineFriends {
    @Override
    public void hi() {
        System.out.println("안녕 나는 브라운이야!");
    }

    @Override
    public void dance() {
        System.out.println("춤신춤왕 브라운!");
    }
}
