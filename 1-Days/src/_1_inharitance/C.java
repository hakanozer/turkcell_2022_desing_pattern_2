package _1_inharitance;

public class C extends Base {

    public C(int a) {
        super(a);
    }

    @Override
    public void write() {
        System.out.println("C Write Call");
    }

}
