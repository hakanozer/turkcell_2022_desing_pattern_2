package _2_decorator;

public class MainDecorator {
    public static void main(String[] args) {

        IProduct tv = new TV();
        IProduct tvplusma = new PlusmaTV();
        IProduct smartTv = new SmartTV();

        tv.title();
        tv.price();
        tv.size();

        tv.title();
        tvplusma.price();
        tvplusma.size();

        smartTv.title();
        smartTv.price();
        smartTv.size();

    }
}
