package kr.ac.uos.designpattern.lecture.command.command;

import kr.ac.uos.designpattern.lecture.command.receiver.Device;
import kr.ac.uos.designpattern.lecture.command.receiver.Stereo;
import kr.ac.uos.designpattern.lecture.command.receiver.StereoImpl;

public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
