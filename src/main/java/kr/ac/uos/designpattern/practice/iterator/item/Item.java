package kr.ac.uos.designpattern.practice.iterator.item;

import kr.ac.uos.designpattern.practice.iterator.composite.MenuComponent;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter //롬북 사용
@AllArgsConstructor //롬북 사용
public class Item extends MenuComponent {
    private String name;
    private String description;
    private double price;
    @Override
    public void print() {
        System.out.print("  "+getName());
        System.out.print(", "+getPrice());
        System.out.println("    -- "+getDescription());
    }
}
