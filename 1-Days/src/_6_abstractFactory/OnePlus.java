package _6_abstractFactory;

public class OnePlus implements IMobile {

    @Override
    public String brandName() {
        return "OnePlus";
    }

    @Override
    public int price() {
        return 10000;
    }

    @Override
    public String color() {
        return "Black";
    }

}
