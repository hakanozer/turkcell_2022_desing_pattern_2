package _5_factory;

public class AudiFabric extends CarFabric {

    @Override
    public void createCar() {
        A3 a3 = new A3(100, false);
        A4 a4 = new A4(150);
        getCarList().add(a3);
        getCarList().add(a4);
    }

}
