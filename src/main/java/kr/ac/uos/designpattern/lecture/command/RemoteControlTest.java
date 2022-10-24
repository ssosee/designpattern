package kr.ac.uos.designpattern.lecture.command;

import kr.ac.uos.designpattern.lecture.command.command.Command;
import kr.ac.uos.designpattern.lecture.command.command.GarageDoorOpenCommand;
import kr.ac.uos.designpattern.lecture.command.command.LightOnCommand;
import kr.ac.uos.designpattern.lecture.command.invoker.SimpleController;
import kr.ac.uos.designpattern.lecture.command.receiver.Device;
import kr.ac.uos.designpattern.lecture.command.receiver.GarageDoor;
import kr.ac.uos.designpattern.lecture.command.receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleController remote = new SimpleController();

        Device livingRoom = new Light("거실");
        Device garage = new GarageDoor("차고지");
        LightOnCommand lightOn = new LightOnCommand(livingRoom);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garage);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
