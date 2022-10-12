package kr.ac.uos.designpattern.lecture.command.command;

/**
 * null 객체용
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("커맨드가 없습니다.");
    }
}
