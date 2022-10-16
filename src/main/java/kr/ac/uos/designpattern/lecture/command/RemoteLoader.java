package kr.ac.uos.designpattern.lecture.command;

import kr.ac.uos.designpattern.lecture.command.command.*;
import kr.ac.uos.designpattern.lecture.command.invoker.RemoteControl;
import kr.ac.uos.designpattern.lecture.command.receiver.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Device livingRoomLight = new Light("거실");
        Device kitchenLight = new Light("부엌");
        Device garageDoor = new GarageDoor("차고지");
        Stereo stereo = new StereoImpl("거실");
        Fan ceilingFan = new CeilingFan("안방");

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);
        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.setCommand(4, ceilingFanHighCommand, ceilingFanOffCommand);
        System.out.println(remoteControl);

        for(int i = 0; i < 5; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
            remoteControl.undoButtonWasPushed();
        }
    }
}
