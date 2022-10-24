package kr.ac.uos.designpattern.practice.state;

public class TicketMachineDrive {
    public static void main(String[] args) {
        TicketMachine ticketMachine = new TicketMachine();

        ticketMachine.insertCoin();
        ticketMachine.printTicket();

        ticketMachine.printTicket();
    }
}
