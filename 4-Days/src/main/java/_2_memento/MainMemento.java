package _2_memento;

public class MainMemento {
    public static void main(String[] args) {

        DataMemento d1 = new DataMemento("Line 6");
        DataMemento d2 = new DataMemento("Line 7");
        DataMemento d3 = new DataMemento("Line 8");
        DataMemento d4 = new DataMemento("Line 9");

        MementoManager manager = new MementoManager();
        manager.add(d1);
        manager.add(d2);
        manager.add(d3);
        manager.add(d4);

        manager.remove(d1);
        System.out.println( manager.get(1) );


    }
}
