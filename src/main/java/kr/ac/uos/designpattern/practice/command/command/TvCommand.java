package kr.ac.uos.designpattern.practice.command.command;

import kr.ac.uos.designpattern.practice.command.receiver.Device;

public class TvCommand implements Command {

    private Device device;

    public TvCommand(Device device) {
        this.device = device;
    }
    //캡슐화
    @Override
    public void execute() {
        device.on();
    }
    //캡슐화
    @Override
    public void undo() {
        device.off();
    }
}
