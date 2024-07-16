
package logic;

import java.util.Date;


public class Gurdian extends Person{
    private int urdian;
    private String gurdian_type;

    public Gurdian() {
    }

    public Gurdian(int urdian, String gurdian_type, String ID, String name, String last_name, String phone, String address, Date dob) {
        super(ID, name, last_name, phone, address, dob);
        this.urdian = urdian;
        this.gurdian_type = gurdian_type;
    }

    public int getUrdian() {
        return urdian;
    }

    public void setUrdian(int urdian) {
        this.urdian = urdian;
    }

    public String getGurdian_type() {
        return gurdian_type;
    }

    public void setGurdian_type(String gurdian_type) {
        this.gurdian_type = gurdian_type;
    }


    
    
}
