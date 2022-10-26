package _1_composite;

public class MainComposite {

    static Computer computer = new Computer();

    public static void main(String[] args) {

        Part monitor = new Monitor();
        Part ram4 = new Ram4GB();
        Part ram4_1 = new Ram4GB();
        Part ram8 = new Ram8GB();
        Part keyboard = new Keyboard();

        addPart(monitor);
        addPart(ram4);
        addPart(ram4_1);
        addPart(ram8);
        addPart(keyboard);

        // remove part
        computer.remove(ram4_1);

        computer.getParts().forEach(item -> {
            System.out.println("Name : "+ item.name() + " Price: " + item.price());
        });
        double total = computer.total();
        System.out.println( "Total : " + total );
    }

    public static void addPart( Part part ) {
        computer.add(part);
    }
}
