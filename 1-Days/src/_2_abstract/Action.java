package _2_abstract;

public abstract class Action {

    abstract int accountNumber();

    public int total() {
         int number = accountNumber();
         if (number == 100)
             return 1000000;
         if (number == 200)
             return 2000000;
         return 0;
    }

    public String name() {
        int number = accountNumber();
        if (number == 100)
            return "Ali Bilmem";
        if (number == 200)
            return "Zeki Bilirim";
        return "";
    }

}
