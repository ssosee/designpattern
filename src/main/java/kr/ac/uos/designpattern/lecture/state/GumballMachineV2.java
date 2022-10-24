package kr.ac.uos.designpattern.lecture.state;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString(of = {"count"})
public class GumballMachineV2 {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state;
    private int count = 0;


    public GumballMachineV2(int count) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);

        this.count = count;
        this.state = count > 0 ? noQuarterState : soldOutState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if(count > 0) {
            count = count - 1;
        }
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("알맹이 리필, 현재 알맹이 수="+this.count);
    }
}
