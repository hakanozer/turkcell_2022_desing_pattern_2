package _4_observer;

public interface IReader {

    void addNews( INews news );
    void update();
    void cancelNews();

}
