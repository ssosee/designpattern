package kr.ac.uos.designpattern.practice.state;

import lombok.Getter;

@Getter
public class TicketMachine {
    private State hasCoinState;
    private State noCoinState;
    private State state;

    public TicketMachine() {
        this.hasCoinState = new HasCoinState(this);
        this.noCoinState = new NoCoinState(this);
        this.state = this.noCoinState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void printTicket() {
        state.printTicket();
    }
}
