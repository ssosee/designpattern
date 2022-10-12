package kr.ac.uos.designpattern.lecture.command.command;

import kr.ac.uos.designpattern.lecture.command.receiver.Device;

public class LightOnCommand implements Command {

    private Device light;

    public LightOnCommand(Device light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
