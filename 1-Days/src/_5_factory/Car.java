package _5_factory;

public class Car {

    private String title;
    private String model;
    private int power;
    private CarType carType;

    public Car(String title, String model, int power, CarType carType) {
        this.title = title;
        this.model = model;
        this.power = power;
        this.carType = carType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                ", carType=" + carType +
                '}';
    }
}
