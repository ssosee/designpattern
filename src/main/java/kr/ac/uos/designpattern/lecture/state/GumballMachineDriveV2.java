package kr.ac.uos.designpattern.lecture.state;

public class GumballMachineDriveV2 {
    public static void main(String[] args) {
        GumballMachineV2 gumballMachineV2 = new GumballMachineV2(5);

        System.out.println(gumballMachineV2);

        gumballMachineV2.insertQuarter();
        gumballMachineV2.turnCrank();

        System.out.println(gumballMachineV2);

        gumballMachineV2.insertQuarter();
        gumballMachineV2.turnCrank();

        gumballMachineV2.insertQuarter();
        gumballMachineV2.turnCrank();

        System.out.println(gumballMachineV2);

        gumballMachineV2.refill(100);
    }
}
