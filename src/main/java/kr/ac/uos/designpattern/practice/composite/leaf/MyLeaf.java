package kr.ac.uos.designpattern.practice.composite.leaf;

import kr.ac.uos.designpattern.practice.composite.component.MyComponent;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MyLeaf extends MyComponent {

    private String description;

    @Override
    public void print() {
        System.out.println("부가설명="+getDescription());
    }
}
