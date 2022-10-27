package _1_command;

import java.util.ArrayList;
import java.util.List;

public class AboneManager {

    List<IAbone> ls = new ArrayList<>();

    public void takeAbone( IAbone iAbone ) {
        ls.add(iAbone);
    }

    public void removeTakeAbone( IAbone iAbone ) {
        if ( ls.contains(iAbone) ) {
            ls.remove(iAbone);
        }
    }

    public void placeAbone() {
        for ( IAbone item : ls ) {
            item.execute();
        }
    }


}
