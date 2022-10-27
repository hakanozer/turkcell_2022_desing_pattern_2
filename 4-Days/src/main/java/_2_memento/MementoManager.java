package _2_memento;

import java.util.ArrayList;
import java.util.List;

public class MementoManager {

   private List<DataMemento> list = new ArrayList<>();
   int i = 0;

   public void add( DataMemento memento ) {
       list.add(memento);
       i++;
   }

   public void remove( DataMemento memento ){
       if ( list.contains(memento) ) {
           list.remove(memento);
           i--;
       }
   }

   public DataMemento get( int index ) {
       if ( index >= 0 && index <= i && list.size() > index  ) {
           return list.get(index);
       }
       return null;
   }

   public DataMemento undo() {
       if ( i > 0) {
           i--;
           return list.get(i);
       }
       return null;
   }


}
