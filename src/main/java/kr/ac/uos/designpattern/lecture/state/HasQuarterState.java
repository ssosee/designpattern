package kr.ac.uos.designpattern.lecture.state;

import java.util.Random;

public class HasQuarterState implements State {

    private GumballMachineV2 gumballMachineV2;
    private Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachineV2 gambleMachineV2) {
        this.gumballMachineV2 = gambleMachineV2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전은 한개만 넣어주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전이 반환 됩니다.");
        gumballMachineV2.setState(gumballMachineV2.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌렸습니다.");
        int winner = randomWinner.nextInt(9);
        if(winner == 0 && gumballMachineV2.getCount() > 1) {
            gumballMachineV2.setState(gumballMachineV2.getWinnerState());
        } else {
            gumballMachineV2.setState(gumballMachineV2.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }
}
