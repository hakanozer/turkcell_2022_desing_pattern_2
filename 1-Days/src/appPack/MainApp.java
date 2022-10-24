package appPack;

import _1_inharitance.Base;
import _1_inharitance.A;
import _1_inharitance.B;
import _1_inharitance.C;
import _2_abstract.Customer;
import _3_interface.IProfile;
import _3_interface.IUser;
import _3_interface.User;
import _4_singleton.DB;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        ArrayList<String> lsx = new ArrayList<>();
        List<String> ls = new ArrayList<>();
        // a -> List
        // b -> ArrayList
        // c -> List + ArrayList

        Base a = new A(1);
        Base b = new B(2);
        Base c = new C(3);

        call(a);
        call(b);
        call(c);

        // abstract Call
        Customer customer = new Customer(200);
        System.out.println(customer.name());
        System.out.println(customer.total());

        // interface call
        User user = new User();
        // interface filter
        IUser iUser = new User();
        IProfile iProfile = new User();


        // singleton call
        for (int i = 0; i < 100; i++) {
            DB db = DB.getInstance();
            db.mt1();
            db.mt2();
        }



    }

    public static void call( Base base ) {
        if ( base instanceof A ) {
            A nsa = (A) base;
            int sm = nsa.sum(40,60);
            System.out.println("Sum : " + sm);
        }
        base.write();
    }

}
