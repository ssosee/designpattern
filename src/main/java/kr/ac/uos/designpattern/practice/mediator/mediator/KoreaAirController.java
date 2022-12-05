package kr.ac.uos.designpattern.practice.mediator.mediator;

import kr.ac.uos.designpattern.practice.mediator.colleague.AirPlane;
import kr.ac.uos.designpattern.practice.mediator.colleague.AirPlane707;
import kr.ac.uos.designpattern.practice.mediator.colleague.JejuAirPlane;

import java.util.ArrayList;
import java.util.List;

public class KoreaAirController implements AirController {

    private List<AirPlane> airPlanes = new ArrayList<>();
    private String message;

    @Override
    public void add(AirPlane airPlane) {
        airPlanes.add(airPlane);
    }

    @Override
    public void delete(AirPlane airPlane) {
        airPlanes.remove(airPlane);
    }

    /**
     * 객체 서로간의 메시지를 중재자를 두고 전달할 수 있다.
     * @param message
     * @param fromPlane
     * @param toPlane
     */
    @Override
    public void send(String message, AirPlane fromPlane, AirPlane toPlane) {
        System.out.println(fromPlane.getName()+"님, 여기는 코리아 항공 관제센터 입니다. "+toPlane.getName()+"에게 내용 전달합니다. ["+message+"] 이상");
        toPlane.receive(message);
    }

    @Override
    public void receive(String message, AirPlane airPlane) {
        if(airPlane instanceof AirPlane707) {
            System.out.println(airPlane.getName()+"님, 여기는 코리아 항공 관제센터 입니다. 아래 메시지 수신 받았습니다. ["+message+"] 수신 양호");
        }
        if(airPlane instanceof JejuAirPlane) {
            System.out.println(airPlane.getName()+"님, 여기는 코리아 항공 관제센터 입니다. 아래 메시지 수신 받았습니다. ["+message+"] 수신 양호");
        }
    }

    @Override
    public void sendAll(String message, AirPlane airPlane) {
        for (AirPlane plane : airPlanes) {
            if(plane != airPlane) {
                System.out.println("모든 비행기에 알립니다. "+airPlane.getName()+"님, 여기는 코리아 항공 관제센터 입니다. 내용 전달합니다. ["+message+"] 이상");
                plane.receive(message);
            }
        }
    }
}
