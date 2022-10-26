package _5_proxy;

public class OrderUserProxy implements IOrder {

    Product product;
    public OrderUserProxy( Product product ) {
        this.product = product;
    }

    @Override
    public void sendOrder(User user) {
        if ( user.getTotal() >= product.getPrice() ) {
            System.out.println(user.getName() + " - Order Succsess");
        }else {
            System.out.println("Order Fail");
        }
    }
}
