
package logic;

import java.util.Date;


public class Secretary extends Person{
    private int id_secretary;
    private String area;
    private User anUser;

    public Secretary() {
    }

    public Secretary(int id_secretary, String area, User anUser, String ID, String name, String last_name, String phone, String address, Date dob) {
        super(ID, name, last_name, phone, address, dob);
        this.id_secretary = id_secretary;
        this.area = area;
        this.anUser = anUser;
    }

    public int getId_secretary() {
        return id_secretary;
    }

    public void setId_secretary(int id_secretary) {
        this.id_secretary = id_secretary;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public User getAnUser() {
        return anUser;
    }

    public void setAnUser(User anUser) {
        this.anUser = anUser;
    }
    
    
}
