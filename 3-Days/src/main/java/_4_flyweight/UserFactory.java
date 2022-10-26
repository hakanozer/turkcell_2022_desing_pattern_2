package _4_flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserFactory {

    Map<EUser, User> hm = new LinkedHashMap<>();

    public User getUser( EUser eUser, String name ) {
        if ( hm.containsKey(eUser) ) {
            User u = hm.get(eUser);
            u.setName(name);
            return u;
        }
        User user = null;
        switch ( eUser ) {
            case NORMAL:
                user = new NormalUser(name, "user@mail.com", 100);
                break;
            case PREMIUM:
                user = new PremiumUser(name, "user@mail.com", 500);
                break;
            case GOLD:
                user = new GoldUser(name, "user@mail.com", 1000);
                break;
        }
        hm.put(eUser, user);
        return user;
    }

}
