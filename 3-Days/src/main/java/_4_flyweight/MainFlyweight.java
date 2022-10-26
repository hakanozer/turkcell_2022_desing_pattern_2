package _4_flyweight;

public class MainFlyweight {
    public static void main(String[] args) {

        UserFactory userFactory = new UserFactory();

        User u1 = userFactory.getUser(EUser.NORMAL, "Ali");
        User u2 = userFactory.getUser(EUser.NORMAL, "Erkan");
        User u3 = userFactory.getUser(EUser.NORMAL, "Serkan");

        User u4 = userFactory.getUser(EUser.PREMIUM, "Zehra");
        User u5 = userFactory.getUser(EUser.GOLD, "Kemal");
        User u6 = userFactory.getUser(EUser.GOLD, "Kemal");

        System.out.println( u1 );
        System.out.println( u2 );
        System.out.println( u3 );
        System.out.println( u4 );
        System.out.println( u5 );
        System.out.println( u6 );


    }
}
