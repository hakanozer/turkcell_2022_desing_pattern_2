package state;

public class Manager {

    private State state;
    private DB db;
    public Manager(DB db ) {
        state = new DBClose();
        this.db = db;
    }

    public void start() {
        state.open(db);
    }

    public void stop() {
        state.close(db);
    }

}
