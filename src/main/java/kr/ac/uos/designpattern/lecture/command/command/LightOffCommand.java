package kr.ac.uos.designpattern.lecture.command.command;

import kr.ac.uos.designpattern.lecture.command.receiver.Device;
import kr.ac.uos.designpattern.lecture.command.receiver.Light;

public class LightOffCommand implements Command {
    private Device light;

    public LightOffCommand(Device light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
