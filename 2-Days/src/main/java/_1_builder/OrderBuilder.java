package _1_builder;

public abstract class OrderBuilder {

    private Car car = null;

    public Car getCar() {
        if ( car == null ) {
            car = new Car();
        }
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public abstract void setMarka( String marka );
    public abstract void setModel( String model );
    public abstract void setRenk( String renk );

}
