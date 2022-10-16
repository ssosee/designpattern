package kr.ac.uos.designpattern.practice.command.invoker;

import kr.ac.uos.designpattern.practice.command.command.Command;

public class RemoteController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onButtonWasPush() {
        command.execute();
    }

    public void offButtonWasPush() {
        command.undo();
    }
}
