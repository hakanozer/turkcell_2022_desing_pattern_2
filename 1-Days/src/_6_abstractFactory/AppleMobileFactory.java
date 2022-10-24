package _6_abstractFactory;

public class AppleMobileFactory extends MobileFactory {

    @Override
    public IMobile crate(MobileType mobileType) {
        switch (mobileType) {
            case IPHONE:
                return new iPhone();
        }
        return null;
    }

}
