package kr.ac.uos.designpattern.practice.iterator.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter //롬북 사용
@AllArgsConstructor //롬북 사용
public class Item {
    private String name;
    private String description;
    private double price;
}
