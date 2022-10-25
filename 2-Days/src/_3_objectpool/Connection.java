package _3_objectpool;

public class Connection implements IConnection {

    @Override
    public void save() {
        System.out.println("Save HashCode :" + this.hashCode() );
    }

    @Override
    public void delete() {

    }
}
