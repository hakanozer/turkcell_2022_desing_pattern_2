package _1_command;

public class Customer {

    private String name;
    private int age;

    public void add() {
        System.out.println("Add :" + toString());
    }

    public void remove() {
        System.out.println("Remove :" + toString() );
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
