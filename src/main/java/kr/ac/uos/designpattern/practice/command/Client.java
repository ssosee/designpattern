package kr.ac.uos.designpattern.practice.command;

import kr.ac.uos.designpattern.practice.command.command.AirconCommand;
import kr.ac.uos.designpattern.practice.command.command.Command;
import kr.ac.uos.designpattern.practice.command.command.TvCommand;
import kr.ac.uos.designpattern.practice.command.invoker.RemoteController;
import kr.ac.uos.designpattern.practice.command.receiver.Aircon;
import kr.ac.uos.designpattern.practice.command.receiver.Device;
import kr.ac.uos.designpattern.practice.command.receiver.TV;

public class Client {
    public static void main(String[] args) {
        //Receiver 생성
        Device tv = new TV("티비");
        Device aircon = new Aircon("에어컨");
        //Command 생성
        Command airconCommand = new AirconCommand(aircon);
        Command tvCommand = new TvCommand(tv);
        //Invoker 생성
        RemoteController remoteController = new RemoteController();
        //커맨드 의존성 추가
        remoteController.setCommand(airconCommand);
        remoteController.onButtonWasPush();
        remoteController.offButtonWasPush();
        //커맨드 의존성 추가
        remoteController.setCommand(tvCommand);
        remoteController.onButtonWasPush();
        remoteController.offButtonWasPush();
    }
}
