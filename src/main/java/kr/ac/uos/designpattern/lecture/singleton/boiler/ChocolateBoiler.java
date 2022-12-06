package kr.ac.uos.designpattern.lecture.singleton.boiler;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    //보일러에 우유와 초콜릿을 혼합한 재료를 넣는다.
    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    //끓인 재료를 다음 단계로 넘긴다.
    public void drain() {
        if(!isEmpty() && isBoiled()) {
            boiled = true;
        }
    }

    //재료를 끓인다.
    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }
}
