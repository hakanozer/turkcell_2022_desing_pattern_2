package _4_singleton;

import java.util.Random;

public class DB {

    Random random = new Random();

    private static DB instance = null;

    private static Object lock = new Object();

    private DB () {}

    public static DB getInstance() {
        if ( instance == null ) {
            synchronized (lock) {
                instance = new DB();
                System.out.println("init DB");
            }
        }
        return instance;
    }

    public void mt1() {
        String m1 = "m1";
        Random rnd = new Random();
        System.out.println("mt1 Call " + rnd.hashCode());
        System.out.println("mt1 Random " + random.hashCode());
    }

    public void mt2() {
        String m2 = "m1";
        Random rnd = new Random();
        System.out.println("mt2 Call " + rnd.hashCode());
        System.out.println("mt2 Random " + random.hashCode());
    }

}
