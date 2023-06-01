package Kiosk.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Menu> orderList = new ArrayList<>();
    ArrayList<Menu> orderHistoryList = new ArrayList<>();
    PrintMenu printMenu = new PrintMenu();
    int count = 1;
    double allCount = 0;

    public void addOrder(ArrayList<Menu> list, int menuNum) {
        System.out.println();
        Product product = (Product) list.get(menuNum-1);
        System.out.printf("%-20s | %.1f | %s \n", product.getName(), product.getPrice(), product.getDesc());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인  |  2. 취소");
        System.out.println();
        System.out.print("주문 : ");
        int isYorN = sc.nextInt();
        if (isYorN == 1) {
            System.out.println();
            System.out.println(product.getName() + "가 장바구니에 추가되었습니다.");
            System.out.println("메인화면으로 돌아갑니다.");
            System.out.println();
            orderList.add(product);
        } else {
            System.out.println("메인화면으로 돌아갑니다.");
            System.out.println();
        }
    }

    /**
     * 장바구니 확인 후 주문
     */
    public void cartOrderStart() {
        if (orderList.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("아래와 같이 주문하시겠습니까?");
            System.out.println();
            System.out.println("[ Orders ]");
            printMenu.printMenu(orderList);
            System.out.println();
            System.out.println("[ Total ]");
            System.out.println("w " + printMenu.addSum(orderList));
            System.out.println();
            System.out.println("1. 주문  |  2. 메뉴판");
            int input = sc.nextInt();

            if (input == 1) {
                System.out.println();
                System.out.println("주문이 완료되었습니다!");
                System.out.println();
                System.out.println("대기번호는 [" + (count++) + "] 번 입니다.");
                System.out.println("3초 후 메뉴판으로 돌아갑니다.");
                System.out.println();
                orderHistoryList.addAll(orderList);
                orderList.clear();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    return;
                }
            } else if (input == 2){
                System.out.println("메인 화면으로 돌아갑니다.");
                System.out.println();
            }
        }
    }

    /**
     * 주문 취소 메서드
     */
    public void emptyCart() {
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인  |  2. 취소");
        System.out.println();
        System.out.print("주문 : ");
        String input = sc.nextLine().trim();

        if (input.equals("1")) {
            if (orderList.isEmpty()) {
                System.out.println("장바구니가 비어있습니다.");
                System.out.println();
            } else {
                orderList.clear();
                System.out.println("진행하던 주문이 취소되었습니다.");
                System.out.println();
            }
        } else {
            System.out.println("메인화면으로 돌아갑니다.");
            System.out.println();
        }
    }

    /**
     * 총 판매목록과 판매금액 출력
     */
    public void orderHistory() {
        System.out.println();
        System.out.println("[ 총 판매상품 목록 현황 ]");
        System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");
        System.out.println();

        for (int i = 0; i < orderHistoryList.size(); i++) {
            Product product = (Product) orderHistoryList.get(i);
            allCount += product.getPrice();
            System.out.println("- " + product.getName() + "  |  w " + product.getPrice());
        }

        System.out.println();
        System.out.println("[ 총 판매금액 현황 ]");
        System.out.println("현재까지 총 판매된 금액은 [ w " + allCount + " ] 입니다.");
        System.out.println();
        System.out.println("1. 돌아가기");
        System.out.print("입력 : ");
        int input = sc.nextInt();
        System.out.println();
        System.out.println();
        if (input == 1) {
            return;
        }
    }
}
