package kr.ac.uos.designpattern.practice.factory.abstractt.pizza;

import kr.ac.uos.designpattern.practice.factory.abstractt.product.Cheese;
import kr.ac.uos.designpattern.practice.factory.abstractt.product.Dough;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public abstract class Pizza {
    Cheese cheese;
    Dough dough;

    public abstract void prepare();
}
