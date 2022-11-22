package kr.ac.uos.designpattern.lecture.prototype;

public class DeepPrototype implements Cloneable {

    private Book book;

    @Override
    protected DeepPrototype clone() throws CloneNotSupportedException {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.book = this.book;

        return deepPrototype;
    }
}
