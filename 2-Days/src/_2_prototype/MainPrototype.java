package _2_prototype;

public class MainPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {

        AddresPrototype ad1 = new AddresPrototype("İş Yeri", "1231231", "iş yeri adresi");
        System.out.println( ad1 );
        System.out.println(ad1.hashCode());

        AddresPrototype ad2 = ad1.clone();
        ad2.setTitle("Ev");
        ad2.setAddress("Ev Adresi");
        System.out.println(ad2);
        System.out.println(ad2.hashCode());


    }

}
