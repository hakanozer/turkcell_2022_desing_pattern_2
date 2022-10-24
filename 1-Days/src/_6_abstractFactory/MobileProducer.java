package _6_abstractFactory;

public class MobileProducer {

    public static MobileFactory cretaFactory( FactoryType factoryType ) {
        switch (factoryType) {
            case IPHONE:
                return new AppleMobileFactory();
            case ANDROID:
                return new AndroidMobileFactory();
        }
        return null;
    }

}
