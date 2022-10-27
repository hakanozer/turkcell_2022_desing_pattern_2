package _1_command;

public class AddAbone implements IAbone {

    Customer customer;
    public AddAbone(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void execute() {
        customer.add();
    }

}
