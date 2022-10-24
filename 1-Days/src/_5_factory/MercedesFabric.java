package _5_factory;

public class MercedesFabric extends CarFabric {

    @Override
    public void createCar() {
        C180 c180 = new C180(90);
        E250 e250 = new E250(200);
        getCarList().add(c180);
        getCarList().add(e250);
    }

}
