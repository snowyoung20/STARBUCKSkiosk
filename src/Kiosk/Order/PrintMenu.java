package Kiosk.Order;

import java.util.ArrayList;
public class PrintMenu {

    /**
     * 전달받은 값으로 타이틀 출력
     * @param : 출력하고 싶은 메뉴 카테고리 이름
     */
    public void printTitle(String title) {
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ " + title + " MENU ]");
    }

    /**
     * 메인 화면 출력
     * @param : 메인 메뉴 리스트
     * @param : 오더 메뉴 리스트
     */
    public void printMain(ArrayList<Menu> MenuList, ArrayList<Menu> orderMenuList) {
        for (int i = 0; i < MenuList.size(); i++) {
            Menu menu = MenuList.get(i);
            System.out.printf("%d. %-15s \t | %s", i + 1, menu.getName(), menu.getDesc());
            System.out.println();
        }
        System.out.println();
        System.out.println("[ ORDER MENU ]");

        for (int i = 0; i<orderMenuList.size(); i++) {
            Menu menu = orderMenuList.get(i);
            System.out.printf("%d. %-15s \t | %s", i + 1, menu.getName(), menu.getDesc());
            System.out.println();
        }
    }

    /**
     * 상세 메뉴 출력
     * @param : 출력할 싶은 상세 메뉴리스트
     */
    public void printMenu(ArrayList<Menu> list) {
        for (int i = 0; i < list.size(); i++) {
            Product product = (Product)list.get(i);
            System.out.printf("%d. %-20s | %.1f | %s \n", i + 1, product.getName(), product.getPrice(), product.getDesc());
        }
    }

    /**
     * 총액 구하는 메서드
     * @param : 사용자의 주문 내역 담은 리스트
     * @return : 총액
     */
    public double addSum(ArrayList<Menu> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Product product = (Product)list.get(i);
            sum += product.getPrice();
        }
        return sum;
    }
}
