package kr.ac.uos.designpattern.lecture.state.notapply;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Enumerated;

@Getter
public enum StateConst {
    SOLD_OUT,
    NO_QUARTER,
    HAS_QUARTER,
    SOLD
}
