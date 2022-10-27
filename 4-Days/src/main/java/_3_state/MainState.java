package _3_state;

public class MainState {
    public static void main(String[] args) {

        DB db = new DB();
        Manager manager = new Manager(db);
        manager.start();
        manager.start();
        manager.start();
        manager.stop();

    }
}
