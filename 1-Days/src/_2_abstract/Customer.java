package _2_abstract;

public class Customer extends Action{

    int num = 0;
    public Customer ( int num ){
        this.num = num;
    }

    @Override
    int accountNumber() {
        return num;
    }

}
