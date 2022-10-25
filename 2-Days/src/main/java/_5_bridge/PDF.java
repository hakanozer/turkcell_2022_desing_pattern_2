package _5_bridge;

import java.util.List;

public class PDF extends Print implements IPrintSender{

    @Override
    void printSend(List<String> ls) {
        System.out.println("PDF printSender Call: " + ls);
    }

    @Override
    public void printSender() {
        System.out.println("PDF printSender Call");
    }

}
