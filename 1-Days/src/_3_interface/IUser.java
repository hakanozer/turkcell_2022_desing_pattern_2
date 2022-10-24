package _3_interface;

public interface IUser {

    String userName(int userID);
    String userEmail(int userUD);

    default void profileName() {
        System.out.println("Ali Bilmem");
    }

}
