package _5_strategy;

public class OrderManager {

    IPayment iPayment;
    public OrderManager( IPayment iPayment ) {
        this.iPayment = iPayment;
    }


    public void pay(int amount, User user) {
        iPayment.sendPayment(amount, user);
    }




}
