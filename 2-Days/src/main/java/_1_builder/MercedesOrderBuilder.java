package _1_builder;

public class MercedesOrderBuilder extends OrderBuilder{

    @Override
    public void setMarka(String marka) {
        getCar().setMarka(new Marka(marka));
    }

    @Override
    public void setModel(String model) {
        getCar().setModel(new Model(model));
    }

    @Override
    public void setRenk(String renk) {
        getCar().setRenk(renk);
    }
}
