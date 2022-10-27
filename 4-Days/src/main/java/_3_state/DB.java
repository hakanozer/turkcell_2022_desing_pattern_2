package _3_state;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    final private String driver = "org.h2.Driver";
    final private String url = "jdbc:h2:file:~/turkcell_dp;OLD_INFORMATION_SCHEMA=TRUE";
    final private String username = "sa";
    final private String password = "sa";

    public Connection con = null;

    public void connect() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Success");
        }catch (Exception ex) {
            System.err.println("Connection Error : " + ex);
        }
    }

    public void close() {
        try {
            con.close();
            con = null;
            System.out.println("Connection Close Success");
        }catch (Exception ex) {
            System.err.println("Close Error : " + ex);
        }
    }

}
