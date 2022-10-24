package _5_factory;

public class FabricMain {
    public static void main(String[] args) {

        AudiFabric audiFabric = new AudiFabric();
        MercedesFabric mercedesFabric = new MercedesFabric();

        call(audiFabric);
        call(mercedesFabric);

    }

    public static void call( CarFabric carFabric ) {
        carFabric.getCarList().forEach( item -> {
            System.out.println( item );
        });
    }


}
