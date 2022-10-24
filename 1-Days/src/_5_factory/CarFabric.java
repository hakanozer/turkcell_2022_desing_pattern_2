package _5_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class CarFabric {

    public CarFabric() {
        createCar();
    }

    public abstract void createCar();

    private List<Car> carList = new ArrayList<>();

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
