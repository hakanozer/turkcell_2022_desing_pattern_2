package _4_flyweight;

public class NormalUser extends User {

    public NormalUser(String name, String email, int price) {
        super(name, email, price);
    }

    @Override
    public String toString() {
        return "NormalUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", price=" + price + '\'' +
                ", hashcode=" + this.hashCode() +
                '}';
    }
}
