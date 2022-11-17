package kr.ac.uos.designpattern.lecture.iterator;

public interface MyIterator {
    //반복 작업을 수행핼 항목이 있는지 확인한 다음 그 결과를 리턴
    boolean hasNext();
    // 다음 항목을 리턴
    MenuItem next();
    void remove();
}
