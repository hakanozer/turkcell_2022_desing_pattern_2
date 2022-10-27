package _5_strategy;

public class MainStrategy {
    public static void main(String[] args) {

        User user = new User("Ali Bilmem", "ali@mail.com");
        IPayment eft = new EFT("1231231231231231");
        IPayment creditCart = new CreditCart("122342423", "123");

        OrderManager manager = new OrderManager(creditCart);
        manager.pay(300, user);

    }
}
