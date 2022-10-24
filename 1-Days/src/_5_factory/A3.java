package _5_factory;

public class A3 extends Car {

    public A3(int power, boolean performance) {
        super("Audi", "A3", power, CarType.ELECTRIC);
        System.out.println("performance: " + performance);
    }

}
