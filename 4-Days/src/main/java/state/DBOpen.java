package state;

public class DBOpen implements State {

    @Override
    public void open(DB db) {
        System.out.println("DB Status Open");
    }

    @Override
    public void close(DB db) {
        try {
            if ( db.con != null && !db.con.isClosed() ) {
                db.close();
            }
        }catch (Exception ex) {
            System.err.println("DBOpen Error : " + ex);
        }
    }

}
