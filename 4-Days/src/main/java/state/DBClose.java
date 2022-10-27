package state;

public class DBClose implements State{

    @Override
    public void open(DB db) {
        try {
            if ( db != null && (db.con == null) || db.con.isClosed() ) {
                db.connect();
            }
        }catch (Exception ex) {
            System.err.println("DBClose Error : " + ex);
        }
    }

    @Override
    public void close(DB db) {
        System.out.println("DB Status Close");
    }

}
