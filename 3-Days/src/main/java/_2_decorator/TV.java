package _2_decorator;

public class TV implements IProduct {

    @Override
    public void title() {
        System.out.println("TV");
    }

    @Override
    public void price() {
        System.out.println("10000");
    }

    @Override
    public void size() {
        System.out.println("30inc");
    }

}
