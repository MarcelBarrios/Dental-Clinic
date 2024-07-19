
package logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Gurdian extends Person implements Serializable{
//    private int urdian;
    private String gurdian_type;

    public Gurdian() {
    }

    public Gurdian(String gurdian_type, int id, String identification, String name, String last_name, String phone, String address, Date dob) {
        super(id, identification, name, last_name, phone, address, dob);
        this.gurdian_type = gurdian_type;
    }



//    public int getUrdian() {
//        return urdian;
//    }
//
//    public void setUrdian(int urdian) {
//        this.urdian = urdian;
//    }

    public String getGurdian_type() {
        return gurdian_type;
    }

    public void setGurdian_type(String gurdian_type) {
        this.gurdian_type = gurdian_type;
    }


    
    
}