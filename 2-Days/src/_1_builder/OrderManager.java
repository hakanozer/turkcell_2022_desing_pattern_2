package _1_builder;

public class OrderManager {

    private OrderBuilder orderBuilder;

    public Car createOrder( OrderType type, String model, String marka, String renk ) {
        if ( type == OrderType.MERCEDES ) {
            orderBuilder = new MercedesOrderBuilder();
        }
        if ( type == OrderType.BMW ) {
            orderBuilder = new BwmOrderBuilder();
        }
        orderBuilder.setModel(model);
        orderBuilder.setMarka(marka);
        orderBuilder.setRenk(renk);
        return orderBuilder.getCar();
    }


    public void print() {
        System.out.println( orderBuilder.getCar().getMarka().getMarka() );
        System.out.println( orderBuilder.getCar().getModel().getModel() );
        System.out.println( orderBuilder.getCar().getRenk() );
    }

}
