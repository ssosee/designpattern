package kr.ac.uos.designpattern.lecture.iterator;

import kr.ac.uos.designpattern.lecture.iterator.composite.Menu;
import kr.ac.uos.designpattern.lecture.iterator.composite.MenuComponent;

import java.util.List;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouse = new Menu("팬케잌 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 봐요");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");
        allMenus.add(pancakeHouse);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouse.add(new MenuItem("먹물 리조또",
                "효모빵도 드립니다.",
                true,
                4.19));

        dinerMenu.add(new MenuItem("파스타",
                "마리나라 소스 스파케티, 효모빵도 드립니다.",
                true,
                3.89));
        dinerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem("아이스 아메리카노",
                "아주 시원합니다.",
                true,
                2.39));

        dessertMenu.add(new MenuItem("애플 파이", "" +
                "바삭바삭 애플파이에 바닐라 아이스크림까지",
                true,
                1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
