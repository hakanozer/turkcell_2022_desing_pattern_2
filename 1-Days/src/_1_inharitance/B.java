package _1_inharitance;

public class B  extends Base {

    public B(int a) {
        super(a);
    }

    @Override
    public void write() {
        System.out.println("B Write Call");
    }
}