package _6_abstractFactory;

public class AndroidMobileFactory extends MobileFactory{

    @Override
    public IMobile crate(MobileType mobileType) {
        switch (mobileType) {
            case SONY:
                return new Sony();
            case ONEPLUS:
                return new OnePlus();
        }
        return null;
    }

}
