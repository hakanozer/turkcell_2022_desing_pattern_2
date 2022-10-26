package _1_composite;

public class Keyboard implements Part{

    @Override
    public double price() {
        return 200;
    }

    @Override
    public String name() {
        return "Keyboard";
    }
}
