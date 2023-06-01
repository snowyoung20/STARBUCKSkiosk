package Kiosk.Order;

import Kiosk.Order.AllMenu;
import Kiosk.Order.Cart;
import Kiosk.Order.PrintMenu;

import java.util.Scanner;

public class OrderMain {
    public void orderStart() {
        Scanner sc = new Scanner(System.in);
        PrintMenu printMenu = new PrintMenu();
        AllMenu allMenu = new AllMenu();
        Cart cart = new Cart();

        while (true) {
            System.out.println("STARBUCKS에 오신 걸 환영합니다.");
            printMenu.printTitle("STARBUCKS");
            printMenu.printMain(allMenu.menuList(), allMenu.orderMenuList());

            System.out.println();
            System.out.print("입력 : ");
            int input = sc.nextInt();
            System.out.println();

            if (input == 1) {
                printMenu.printTitle("Coffee");
                printMenu.printMenu(allMenu.coffeeList());
                System.out.println("6. 돌아가기");
                System.out.println();

                System.out.print("입력 : ");
                int menuNum = sc.nextInt();
                if (menuNum == 6) {
                    System.out.println("메인화면으로 돌아갑니다.");
                    System.out.println();
                } else cart.addOrder(allMenu.coffeeList(), menuNum);

            } else if (input == 2) {
                printMenu.printTitle("Decaf");
                printMenu.printMenu(allMenu.decafList());
                System.out.println("6. 돌아가기");
                System.out.println();

                System.out.print("입력 : ");
                int menuNum = sc.nextInt();
                if (menuNum == 6) {
                    System.out.println("메인화면으로 돌아갑니다.");
                    System.out.println();
                } else cart.addOrder(allMenu.decafList(), menuNum);

            } else if (input == 3) {
                printMenu.printTitle("Food");
                printMenu.printMenu(allMenu.foodList());
                System.out.println("5. 돌아가기");
                System.out.println();

                System.out.print("입력 : ");
                int menuNum = sc.nextInt();
                if (menuNum == 5) {
                    System.out.println("메인화면으로 돌아갑니다.");
                    System.out.println();
                } else cart.addOrder(allMenu.foodList(), menuNum);

            } else if (input == 4) {
                printMenu.printTitle("Goods");
                printMenu.printMenu(allMenu.goodsList());
                System.out.println("5. 돌아가기");
                System.out.println();

                System.out.print("입력 : ");
                int menuNum = sc.nextInt();
                if (menuNum == 5) {
                    System.out.println("메인화면으로 돌아갑니다.");
                    System.out.println();
                } else cart.addOrder(allMenu.goodsList(), menuNum);

            } else if (input == 5) {
                cart.cartOrderStart();
            } else if (input == 6) {
                cart.emptyCart();
            } else if (input == 0) {
                cart.orderHistory();
            } else {
                System.out.println("메뉴판을 보고 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}



