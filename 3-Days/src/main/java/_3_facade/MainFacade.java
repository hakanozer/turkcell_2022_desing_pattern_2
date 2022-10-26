package _3_facade;

public class MainFacade {
    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();
        boolean status = orderFacade.faceOrder("ali@ali.com", "12345", "644");
        System.out.println("Status: " + status);

    }
}
