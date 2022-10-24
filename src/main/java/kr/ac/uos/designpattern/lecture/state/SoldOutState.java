package kr.ac.uos.designpattern.lecture.state;

public class SoldOutState implements State {

    private GumballMachineV2 gumballMachineV2;

    public SoldOutState(GumballMachineV2 gumballMachineV2) {
        this.gumballMachineV2 = gumballMachineV2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("죄송합니다. 매진 되었습니다.1");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("죄송합니다. 매진 되었습니다.2");
    }

    @Override
    public void turnCrank() {
        System.out.println("죄송합니다. 매진 되었습니다.3");
    }

    @Override
    public void dispense() {
        System.out.println("죄송합니다. 매진 되었습니다.4");
    }
}
