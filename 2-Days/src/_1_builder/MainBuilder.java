package _1_builder;

public class MainBuilder {
    public static void main(String[] args) {

        OrderManager manager = new OrderManager();
        manager.createOrder(OrderType.MERCEDES, "E250", "Mercedes", "Siyah");
        manager.print();

        manager.createOrder(OrderType.BMW, "i116", "BWM", "Beyaz");
        manager.print();



    }
}
