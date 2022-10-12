package kr.ac.uos.designpattern.lecture.command.invoker;

import kr.ac.uos.designpattern.lecture.command.command.Command;

public class SimpleController {

    private Command slot;

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
