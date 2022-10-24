package _6_abstractFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {

        MobileFactory iphoneFactory = MobileProducer.cretaFactory(FactoryType.IPHONE);
        IMobile iphone = iphoneFactory.crate(MobileType.IPHONE);

        MobileFactory androidFactory = MobileProducer.cretaFactory(FactoryType.ANDROID);
        IMobile onePlus = androidFactory.crate(MobileType.ONEPLUS);
        IMobile sony = androidFactory.crate(MobileType.SONY);

        System.out.println( iphone.brandName() );
        System.out.println( onePlus.brandName() );
        System.out.println( sony.brandName() );

    }
}
