package Kiosk.Order;

import java.util.ArrayList;

public class AllMenu {
    public ArrayList<Menu> menuList() {
        Menu menu1 = new Menu("Coffee",  "스타벅스만의 특제 배합 로스팅으로 향이 좋은 커피");
        Menu menu2 = new Menu("Decaf", "카페인이 97% 이상 제거된 차와 음료");
        Menu menu3 = new Menu("Food", "베이글, 케이크 등 차와 곁들이기 좋은 디저트");
        Menu menu4 = new Menu("Goods",  "환경을 생각하는 스타벅스의 리유저블 굿즈");

        ArrayList<Menu> mainMenuList = new ArrayList<>();
        mainMenuList.add(menu1);
        mainMenuList.add(menu2);
        mainMenuList.add(menu3);
        mainMenuList.add(menu4);

        return mainMenuList;
    }

    public ArrayList<Menu> orderMenuList() {
        Menu menu1 = new Menu("Order", "장바구니를 확인 후 주문합니다.");
        Menu menu2 = new Menu("Cancel", "진행중인 주문을 취소합니다.");

        ArrayList<Menu> orderMenuList = new ArrayList<>();
        orderMenuList.add(menu1);
        orderMenuList.add(menu2);

        return orderMenuList;
    }

    public ArrayList<Menu> coffeeList() {
        Product product1 = new Product("에스프레소", 4.0, "입안 가득히 원두와 달콤한 캬라멜 향이 느껴지는 커피 음료");
        Product product2 = new Product("아이스 아메리카노", 4.5, "정수물을 더하여 강렬한 에스프레소를 가장 부드럽고 시원하게 즐길 수 있는 커피 음료");
        Product product3 = new Product("카페 라떼", 5.0, "진한 에스프레소가 시원한 우유를 만나 고소한 맛을 즐길 수 있는 커피 음료");
        Product product4 = new Product("카푸치노", 5.0, "신선한 우유와 우유 거품이 들어가 부드러운 커피 음료");
        Product product5 = new Product("캬라멜 마끼아또", 5.9, "향긋한 바닐라 시럽과 벌집 모양 캬라멜 드리즐을 추가한 달콤한 커피");

        ArrayList<Menu> coffeeList = new ArrayList<>();
        coffeeList.add(product1);
        coffeeList.add(product2);
        coffeeList.add(product3);
        coffeeList.add(product4);
        coffeeList.add(product5);

        return coffeeList;
    }

    public ArrayList<Menu> decafList() {
        Product product1 = new Product("라이트 키위 라임 블렌디드", 6.3, "새콤한 키위 라임과 쫄깃한 곤약 젤리로 가볍게 리프레쉬 할 수 있는 음료");
        Product product2 = new Product("오트 콜드 브루", 5.8, "식물성 대체유를 사용해 모든 고객이 부담없이 즐길 수 있는 콜드 브루 음료");
        Product product3 = new Product("망고 패션 티 블렌디드", 5.4, "망고 주스와 패션 탱고 티가 어우러진 과일 블렌디드");
        Product product4 = new Product("딸기 딜라이트 요거트 블렌디드", 6.3, "요거트와 딸기 과육이 어우러진 과일 요거트 블렌디드");
        Product product5 = new Product("제주 비자림 콜드 브루", 6.8, "제주 유기농 말차와 콜드 브루가 조화로운 제주 특화 콜드 브루 음료");

        ArrayList<Menu> decafList = new ArrayList<>();
        decafList.add(product1);
        decafList.add(product2);
        decafList.add(product3);
        decafList.add(product4);
        decafList.add(product5);

        return decafList;
    }

    public ArrayList<Menu> foodList() {
        Product product1 = new Product("베이컨 치즈 토스트", 4.9, "프렌치 토스트 타입 샌드위치");
        Product product2 = new Product("에그에그 샌드위치", 4.4, "고소한 에그 스프레드를 넣은 부드러운 샌드위치");
        Product product3 = new Product("생크림 카스테라", 4.5, "생크림이 듬뿍 들어간 촉촉한 카스테라");
        Product product4 = new Product("바스크 치즈 케이크", 7.9, "겉면은 스모키하고 속은 크리미한 치즈 케이크");

        ArrayList<Menu> foodList = new ArrayList<>();
        foodList.add(product1);
        foodList.add(product2);
        foodList.add(product3);
        foodList.add(product4);

        return foodList;
    }

    public ArrayList<Menu> goodsList() {
        Product product1 = new Product("하우스 블렌드 250g", 15.0, "균형 잡힌 깔끔함이 특징인 중간 무게감의 원두");
        Product product2 = new Product("케냐 키린야가 250g", 19.0, "과일의 달콤한 산미와 감칠맛이 특징인 원두");
        Product product3 = new Product("뉴트럴 밸류 텀블러", 33.0, "심플한 디자인으로 보냉/보온 기능이 우수한 스테인리스 텀블러");
        Product product4 = new Product("커피리프 힐사이드 텀블러", 21.0, "그린 컬러와 잎사귀 일러스트로 스타벅스를 떠올리게 하는 스테인리스 텀블러");

        ArrayList<Menu> goodsList = new ArrayList<>();
        goodsList.add(product1);
        goodsList.add(product2);
        goodsList.add(product3);
        goodsList.add(product4);

        return goodsList;
    }
}
