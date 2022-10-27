package _2_memento;

public class DataMemento {

    private String data;

    public DataMemento(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataMemento{" +
                "data='" + data + '\'' +
                '}';
    }

}
