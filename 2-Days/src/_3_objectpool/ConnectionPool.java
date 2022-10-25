package _3_objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {


    private static List<Connection> list = new ArrayList<>();

    public ConnectionPool(int count) {
        init(count);
    }

    public void init(int count) {
        for (int i = 0; i < count; i++) {
            list.add( new Connection() );
        }
    }

    public Connection getInstance() throws RuntimeException {
        if ( list.size() > 0 ) {
            Connection con = list.get(0);
            list.remove(0);
            return con;
        }
        throw new RuntimeException();
    }

     public void addInstance( Connection conn ) {
        if ( conn != null ) {
            list.add(conn);
        }
    }

}
