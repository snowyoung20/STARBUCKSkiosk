package Kiosk.Order;


public class Menu {
    private final String name;
    private final String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}


