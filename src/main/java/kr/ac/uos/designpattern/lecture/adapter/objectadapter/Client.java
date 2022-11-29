package kr.ac.uos.designpattern.lecture.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("\n오리 입니다.");
        duck.quack();
        duck.fly();

        System.out.println("\n칠면조 입니다.");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n칠면조 어댑터 입니다.");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
