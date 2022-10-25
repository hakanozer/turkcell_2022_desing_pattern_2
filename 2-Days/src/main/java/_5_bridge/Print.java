package _5_bridge;

import java.util.List;

public abstract class Print {

    IPrintSender iPrintSender = null;
    public void print( IPrintSender iPrintSender ) {
        this.iPrintSender = iPrintSender;
    }

    abstract void printSend(List<String> ls);

}
