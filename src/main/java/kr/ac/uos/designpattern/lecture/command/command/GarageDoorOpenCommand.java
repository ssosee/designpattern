package kr.ac.uos.designpattern.lecture.command.command;

import kr.ac.uos.designpattern.lecture.command.receiver.Device;

public class GarageDoorOpenCommand implements Command {

    private Device garageDoor;

    public GarageDoorOpenCommand(Device garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
    }

    @Override
    public void undo() {
        garageDoor.off();
    }
}
