package _2_prototype;

public class AddresPrototype implements IClonablePrototype<AddresPrototype> {


    private String title;
    private String phone;
    private String address;

    public AddresPrototype(String title, String phone, String address) {
        this.title = title;
        this.phone = phone;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddresPrototype{" +
                "title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public AddresPrototype clone() throws CloneNotSupportedException {
        return (AddresPrototype) super.clone();
    }
}
