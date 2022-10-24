package kr.ac.uos.designpattern.practice.state;

public class NoCoinState implements State {

    private TicketMachine ticketMachine;

    public NoCoinState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    @Override
    public void insertCoin() {
        ticketMachine.setState(ticketMachine.getHasCoinState());
        System.out.println("동전 투입완료!");
    }

    @Override
    public void printTicket() {
        System.out.println("동전이 없습니다. 동전을 넣어주세요.");
    }
}
