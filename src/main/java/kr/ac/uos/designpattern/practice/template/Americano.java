package kr.ac.uos.designpattern.practice.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Americano extends CoffeeBeverage {
    @Override
    public void choiceMenu() {
        System.out.println("아메리카노를 선택했습니다.");
    }

    //hook 재정의
    @Override
    boolean hotOrIce() {
        if(choiceHotOrIce().equals("y")) return false;
        return true;
    }

    private String choiceHotOrIce() {
        String answer = "n";
        System.out.println("아이스로 해드릴까요? y/n");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
            answer.toLowerCase(); //소문자로 변경
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(answer.equals("y")) {
            System.out.println("아이스 음료 선택하셨습니다.");
            return "y";
        }
        System.out.println("뜨거운 음료로 선택하셨습니다.");
        return "n";
    }
}
