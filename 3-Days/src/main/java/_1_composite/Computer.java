package _1_composite;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Part {

    private List<Part> parts = new ArrayList<>();

    // Part Add
    public void add( Part part ) {
        getParts().add(part);
    }

    // Part Remove
    public void remove( Part part ) {
        if ( getParts().contains(part) ) {
            getParts().remove(part);
        }
    }

    // Total Part
    public double total() {
        double total = 0;
        for ( Part item : getParts() ) {
            total += item.price();
        };
        return total;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public String name() {
        return null;
    }

}
