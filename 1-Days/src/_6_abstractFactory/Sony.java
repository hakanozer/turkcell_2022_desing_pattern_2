package _6_abstractFactory;

public class Sony implements IMobile{

    @Override
    public String brandName() {
        return "Sony";
    }

    @Override
    public int price() {
        return 7500;
    }

    @Override
    public String color() {
        return "Yellow";
    }

}
