package kr.ac.uos.designpattern.lecture.command.command;

import kr.ac.uos.designpattern.lecture.command.receiver.CeilingFan;
import kr.ac.uos.designpattern.lecture.command.receiver.Fan;

public class CeilingFanOffCommand implements Command {

    private Fan ceilingFan;
    private int prevSpeed;

    public CeilingFanOffCommand(Fan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
        if(prevSpeed == CeilingFan.HIGH) ceilingFan.high();
        else if(prevSpeed == CeilingFan.MEDIUM) ceilingFan.medium();
        else if(prevSpeed == CeilingFan.LOW) ceilingFan.low();
    }
}
