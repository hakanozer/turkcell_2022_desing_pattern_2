package _1_inharitance;

public class A extends Base {

    public A(int a) {
        super(a);
    }

    @Override
    public void write() {
        System.out.println("A Write Call");
    }

    public int sum( int a, int b ) {
        return a + b;
    }

}
