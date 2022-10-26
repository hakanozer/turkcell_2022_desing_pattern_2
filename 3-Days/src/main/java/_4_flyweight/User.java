package _4_flyweight;

public class User {

     String name;
     String email;
     int price;

    public User(String name, String email, int price) {
        this.name = name;
        this.email = email;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
