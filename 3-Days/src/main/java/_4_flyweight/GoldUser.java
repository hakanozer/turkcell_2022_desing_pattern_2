package _4_flyweight;

public class GoldUser extends User{

    public GoldUser(String name, String email, int price) {
        super(name, email, price);
    }

    @Override
    public String toString() {
        return "GoldUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", price=" + price + '\'' +
                ", hashcode=" + this.hashCode() +
                '}';
    }
}
