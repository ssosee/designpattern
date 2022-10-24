package kr.ac.uos.designpattern.lecture.state.notapply;

import lombok.ToString;

@ToString(of = {"state", "count"})
public class GumballMachine {
    private int state;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        state = count > 0 ? StateConst.NO_QUARTER.ordinal() : StateConst.SOLD_OUT.ordinal();;
    }

    //동전 넣기
    public void insertQuarter() {
        if(state == StateConst.HAS_QUARTER.ordinal()) {
            System.out.println("동전은 한 개만 넣어주세요~");
        } else if(state == StateConst.NO_QUARTER.ordinal()) {
            state = StateConst.HAS_QUARTER.ordinal();
            System.out.println("동전을 넣으셨습니다.");
        } else if(state == StateConst.SOLD_OUT.ordinal()) {
            System.out.println("매진되었습니다.");
        } else if(state == StateConst.SOLD.ordinal()) {
            System.out.println("알맹이를 내보내고 있습니다.");
        }
    }

    //동전 반환
    public void ejectQuarter() {
        if(state == StateConst.HAS_QUARTER.ordinal()) {
            System.out.println("동전이 반환됩니다.");
            state = StateConst.NO_QUARTER.ordinal();
        } else if (state == StateConst.NO_QUARTER.ordinal()) {
            System.out.println("동전을 넣어 주세요.");
        } else if (state == StateConst.SOLD.ordinal()) {
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        } else if (state == StateConst.SOLD_OUT.ordinal()) {
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        }
    }

    //손잡이 돌리기
    public void turnCrank() {
        if(state == StateConst.SOLD.ordinal()) {
            System.out.println("손잡이는 한 번만 돌려 주세요.");
        } else if (state == StateConst.NO_QUARTER.ordinal()) {
            System.out.println("동전을 넣어 주세요.");
        } else if (state == StateConst.SOLD_OUT.ordinal()) {
            System.out.println("매진되었습니다.");
        } else if (state == StateConst.HAS_QUARTER.ordinal()) {
            System.out.println("손잡이를 돌리셨습니다.");
            state = StateConst.SOLD.ordinal();
            dispense();
        }
    }

    //알맹이 내보내기
    private void dispense() {
        if(state == StateConst.SOLD.ordinal()) {
            System.out.println("알맹이를 내보내고 있습니다.");
            count--;
            if (count == 0) {
                System.out.println("더 이상 알맹이가 없습니다.");
                state = StateConst.SOLD_OUT.ordinal();
            } else {
                state = StateConst.NO_QUARTER.ordinal();
            }
        } else if(state == StateConst.NO_QUARTER.ordinal()) {
            System.out.println("동전을 넣어 주세요.");
        } else if (state == StateConst.SOLD_OUT.ordinal()) {
            System.out.println("매진입니다.");
        } else if (state == StateConst.HAS_QUARTER.ordinal()) {
            System.out.println("알맹이를 내보낼 수 없습니다.");
        }
    }
}
