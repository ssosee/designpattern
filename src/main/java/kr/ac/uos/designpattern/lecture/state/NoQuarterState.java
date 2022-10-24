package kr.ac.uos.designpattern.lecture.state;

public class NoQuarterState implements State {

    private GumballMachineV2 gumballMachineV2;

    public NoQuarterState(GumballMachineV2 gambleMachineV2) {
        this.gumballMachineV2 = gambleMachineV2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachineV2.setState(gumballMachineV2.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요.");
    }
}
