package _1_command;

public class RemoveAbone implements IAbone{

    Customer customer;
    public RemoveAbone( Customer customer ) {
        this.customer = customer;
    }

    @Override
    public void execute() {
        customer.remove();
    }

}
