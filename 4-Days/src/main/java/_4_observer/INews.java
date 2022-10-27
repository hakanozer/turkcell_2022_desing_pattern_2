package _4_observer;

public interface INews {

    void readerAdd( IReader reader );
    void readerDelete( IReader reader );
    void newsSend();

}
