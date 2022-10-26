package _5_proxy;


public class MainProxy {
    public static void main(String[] args) {

        User user = new User("Kemal Bilsin", 300);
        Product product = new Product("Kitap", 310);

        IOrder order = new OrderUserProxy(product);
        order.sendOrder(user);

    }
}
