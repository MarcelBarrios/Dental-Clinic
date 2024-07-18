package logic;
import java.util.Date;

public class Person {
    
    private int id;
    private String identification;
    private String name;
    private String last_name;
    private String phone;
    private String address;
    private Date dob;

    public Person(int id, String identification, String name, String last_name, String phone, String address, Date dob) {
        this.id = id;
        this.identification = identification;
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.address = address;
        this.dob = dob;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
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