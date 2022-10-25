package _5_bridge;

import java.util.List;

public class Word extends Print implements IPrintSender {

    @Override
    void printSend(List<String> ls) {
        System.out.println("Word printSender Call: " + ls);
    }

    @Override
    public void printSender() {
        System.out.println("Word printSender Call");
    }

}
