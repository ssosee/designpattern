package kr.ac.uos.designpattern.lecture.state;

public class WinnerState implements State {

    private GumballMachineV2 gumballMachineV2;

    public WinnerState(GumballMachineV2 gumballMachineV2) {
        this.gumballMachineV2 = gumballMachineV2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려주세요.");
    }

    @Override
    public void dispense() {
        gumballMachineV2.releaseBall();
        if(gumballMachineV2.getCount() == 0) {
            gumballMachineV2.setState(gumballMachineV2.getSoldOutState());
        } else {
            gumballMachineV2.releaseBall();
            System.out.println("축하드립니다. 알맹이를 하나 더 받으실 수 있습니다.");
            if(gumballMachineV2.getCount() > 0) {
                gumballMachineV2.setState(gumballMachineV2.getNoQuarterState());
            } else {
                System.out.println("더 이상 알맹이가 없습니다.");
                gumballMachineV2.setState(gumballMachineV2.getSoldState());
            }
        }
    }
}
