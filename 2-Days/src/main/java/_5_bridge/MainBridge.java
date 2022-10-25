package _5_bridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBridge {
    public static void main(String[] args) {

        String[] arr = { "Ankara", "İstanbul", "Adana" };
        List<String> ls = new ArrayList<>(Arrays.asList(arr));

        Print word = new Word();
        word.printSend(ls);

        Print pdf = new PDF();
        pdf.printSend(ls);

    }
}
