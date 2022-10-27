package _5_strategy;

public class CreditCart implements IPayment {

    private String cartNumber;
    private String ccv;
    public CreditCart(String cartNumber,String ccv ) {
        this.cartNumber = cartNumber;
        this.ccv = ccv;
    }

    @Override
    public void sendPayment(int amount, User user) {
        System.out.println( user.getName() + " Total : " + amount + " CreditCart " + cartNumber );
    }

}
