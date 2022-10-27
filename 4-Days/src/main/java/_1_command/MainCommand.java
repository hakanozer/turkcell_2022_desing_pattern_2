package _1_command;

public class MainCommand {
    public static void main(String[] args) {

        Customer cus1 = new Customer("Ali Bilmem", 40);
        Customer cus2 = new Customer("Erkan Bilsin", 35);

        AddAbone a1 = new AddAbone(cus1);
        AddAbone a2 = new AddAbone(cus1);
        AddAbone a3 = new AddAbone(cus2);
        RemoveAbone r1 = new RemoveAbone(cus1);

        AboneManager manager = new AboneManager();
        manager.takeAbone(a1);
        manager.takeAbone(a2);
        manager.removeTakeAbone(a2);
        manager.takeAbone(a3);
        manager.takeAbone(r1);

        manager.placeAbone();


    }
}
