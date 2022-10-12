package kr.ac.uos.designpattern.lecture.command.invoker;

import kr.ac.uos.designpattern.lecture.command.command.Command;
import kr.ac.uos.designpattern.lecture.command.command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        // null 객체 삽입
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n===리모컨===\n");
        for(int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot "+i+"] "+onCommands[i].getClass().getName()+"   "+offCommands[i].getClass().getName()+"\n");
        }

        return String.valueOf(stringBuffer);
    }
}
