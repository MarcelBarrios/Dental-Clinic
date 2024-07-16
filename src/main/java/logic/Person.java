package logic;
import java.util.Date;

public class Person {
    private String ID;
    private String name;
    private String last_name;
    private String phone;
    private String address;
    private Date dob;

    public Person(String ID, String name, String last_name, String phone, String address, Date dob) {
        this.ID = ID;
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.address = address;
        this.dob = dob;
    }

    public Person() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    
}
