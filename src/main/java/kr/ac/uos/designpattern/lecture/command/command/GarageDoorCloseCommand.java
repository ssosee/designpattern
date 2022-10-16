package kr.ac.uos.designpattern.lecture.command.command;

import kr.ac.uos.designpattern.lecture.command.receiver.Device;

public class GarageDoorCloseCommand implements Command {

    private Device garage;

    public GarageDoorCloseCommand(Device garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.off();
    }

    @Override
    public void undo() {
        garage.on();
    }
}
