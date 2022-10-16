package kr.ac.uos.designpattern.practice.command.command;

import kr.ac.uos.designpattern.practice.command.receiver.Device;

public class AirconCommand implements Command {

    private Device device;

    public AirconCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
