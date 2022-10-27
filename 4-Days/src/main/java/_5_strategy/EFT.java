package _5_strategy;

public class EFT implements IPayment {

    private String iban;

    public EFT ( String iban ) {
        this.iban = iban;
    }

    @Override
    public void sendPayment(int amount, User user) {
        System.out.println( user.getName() + " Total : " + amount + " EFT " + iban );
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
