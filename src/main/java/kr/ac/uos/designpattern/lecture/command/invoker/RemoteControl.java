package kr.ac.uos.designpattern.lecture.command.invoker;

import kr.ac.uos.designpattern.lecture.command.command.Command;
import kr.ac.uos.designpattern.lecture.command.command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    //undo 버튼을 눌렀을 때를 대비해서 마지막으로 사용한 커맨드 객체를 넣는 변수
    private Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        // null 객체 삽입
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        /**
         * 다른 슬롯과 마찬가지로 작업 취소 기능을
         * 만들 때도 NoCommand 를 사용합니다.
         *
         * 사용자가 다른 버튼을 한 번도 누르지 않은 상태에서
         * undo 버튼을 누르더라도 별 문제가 없도록 함
         */
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        System.out.println("작업 취소!");
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n===리모컨===\n");
        for(int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot "+i+"] "+onCommands[i].getClass().getName()+"   "+offCommands[i].getClass().getName()+"   "+undoCommand.getClass().getName()+"\n");
        }

        return String.valueOf(stringBuffer);
    }
}
