package _3_state;

public interface State {

    void open(DB db);
    void close(DB db);

}
