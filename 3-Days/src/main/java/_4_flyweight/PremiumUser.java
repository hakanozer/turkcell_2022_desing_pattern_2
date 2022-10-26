package _4_flyweight;

public class PremiumUser extends User {

    public PremiumUser(String name, String email, int price) {
        super(name, email, price);
    }

    @Override
    public String toString() {
        return "PremiumUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", price=" + price + '\'' +
                ", hashcode=" + this.hashCode() +
                '}';
    }
}
