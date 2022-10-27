package _4_observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ANews implements INews {

    private List<IReader> readerList = new ArrayList<>();
    //private Set<IReader> iReaderSet = new HashSet<>();

    @Override
    public void readerAdd(IReader reader) {
        if ( !getReaderList().contains(reader) ) {
            getReaderList().add(reader);
        }
    }

    @Override
    public void readerDelete(IReader reader) {
        if ( getReaderList().contains(reader) ) {
            getReaderList().remove(reader);
        }
    }

    @Override
    public void newsSend() {
        for( IReader item : getReaderList() ) {
            item.update();
        }
    }

    public List<IReader> getReaderList() {
        return readerList;
    }

    public void setReaderList(List<IReader> readerList) {
        this.readerList = readerList;
    }
}
