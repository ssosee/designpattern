package kr.ac.uos.designpattern.practice.mediator;

import kr.ac.uos.designpattern.practice.mediator.colleague.AirPlane;
import kr.ac.uos.designpattern.practice.mediator.colleague.AirPlane707;
import kr.ac.uos.designpattern.practice.mediator.colleague.JejuAirPlane;
import kr.ac.uos.designpattern.practice.mediator.mediator.AirController;
import kr.ac.uos.designpattern.practice.mediator.mediator.KoreaAirController;

public class Client {
    public static void main(String[] args) {
        AirController airController = new KoreaAirController();
        AirPlane airPlane707 = new AirPlane707(airController, "항공707");
        AirPlane jejuAirPlane = new JejuAirPlane(airController, "제주항공");

        airController.add(airPlane707);
        airController.add(jejuAirPlane);

        airController.sendAll("현재 문제 없습니다. 좋은 비행 되세요.", airPlane707);

        airPlane707.send("감사합니다. 안전비행 하겠습니다.");
        jejuAirPlane.send("감사합니다. 좋은 하루되세요.");

        System.out.println("\n==================================================================================");
        airController.send("만나서 반갑습니다.!", airPlane707, jejuAirPlane);
    }
}
