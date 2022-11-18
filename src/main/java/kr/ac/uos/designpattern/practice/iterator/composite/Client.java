package kr.ac.uos.designpattern.practice.iterator.composite;

import kr.ac.uos.designpattern.practice.iterator.item.Item;

public class Client {
    public static void main(String[] args) {
        MenuComponent jansMenu = new MenuComposite("장세웅의 식당", "장세웅의 식당 메뉴 입니다.");
        MenuComponent shinsMenu = new MenuComposite("신영의 식당", "박신영의 식당 메뉴 입니다.");
        MenuComponent starbucksMenu = new MenuComposite("별다방", "별다방 메뉴 입니다.");
        MenuComponent dessertMenu = new MenuComposite("디저트 메뉴", "디저트 메뉴 입니다.");

        MenuComponent menuAll = new MenuComposite("전체 메뉴", "전체 메뉴입니다.");
        menuAll.add(jansMenu);
        menuAll.add(shinsMenu);
        menuAll.add(starbucksMenu);

        jansMenu.add(new Item("가성비 메뉴",
                "가성비 식사 입니다.",
                4000));

        shinsMenu.add(new Item("맛이 일품인 메뉴",
                "맛을 보면 신이 납니다.",
                5500));
        shinsMenu.add(dessertMenu);

        dessertMenu.add(new Item("바닐라 아이스크림",
                "맛있습니다.",
                3500));

        starbucksMenu.add(new Item("아이스 아메리카노",
                "시원합니다.",
                4500));

        Waiter waiter = new Waiter(menuAll);
        waiter.print();
    }
}
