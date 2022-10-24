package _6_abstractFactory;

public class iPhone implements IMobile {

    @Override
    public String brandName() {
        return "iPhone";
    }

    @Override
    public int price() {
        return 15000;
    }

    @Override
    public String color() {
        return "Red";
    }

}
