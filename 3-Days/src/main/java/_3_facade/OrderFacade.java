package _3_facade;

public class OrderFacade {

    public boolean faceOrder( String email, String password, String productId ) {
        boolean status = false;
        User user = new User();
        String loginUserid =  user.login(email, password);
        if ( !loginUserid.equals("") ) {
            Order order = new Order();
            status = order.sendOrder(loginUserid, productId);
        }
        return status;
    }

}
