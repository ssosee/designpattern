package kr.ac.uos.designpattern.practice.mediator.colleague;

import kr.ac.uos.designpattern.practice.mediator.mediator.AirController;

public class JejuAirPlane implements AirPlane {

    private AirController airController;
    private String name;

    public JejuAirPlane(AirController airController, String name) {
        this.airController = airController;
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println("여기는 "+name+" 입니다. ["+message+ "] 이상.");
        airController.receive(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("여기는 "+name+" 입니다. 아래 메시지 수신 받았습니다. ["+message+"] 수신양호 이상.");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
