package _3_objectpool;

public class MainObjectPool {
    public static void main(String[] args) throws RuntimeException {

        ConnectionPool pool = new ConnectionPool(3);

        Connection c1 = pool.getInstance();
        Connection c2 = pool.getInstance();
        Connection c3 = pool.getInstance();

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

    }
}
