package kr.ac.uos.designpattern.practice.state;

public class HasCoinState implements State {

    private TicketMachine ticketMachine;

    public HasCoinState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("이미 동전이 들어 있습니다.");
    }

    @Override
    public void printTicket() {
        ticketMachine.setState(ticketMachine.getNoCoinState());
        System.out.println("사진 출력 완료!");
    }
}
