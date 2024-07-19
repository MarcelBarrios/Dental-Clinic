package logic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Patient extends Person implements Serializable{

//    private int id_patient;
    private boolean insurance;
    private String blood_type;
    
    @OneToOne
    private Gurdian aGurdian;
    
    @OneToMany(mappedBy="patien")
    private List<Shift> ShiftList;

    public Patient() {
    }

    public Patient(boolean insurance, String blood_type, Gurdian aGurdian, List<Shift> ShiftList, int id, String identification, String name, String last_name, String phone, String address, Date dob) {
        super(id, identification, name, last_name, phone, address, dob);
        this.insurance = insurance;
        this.blood_type = blood_type;
        this.aGurdian = aGurdian;
        this.ShiftList = ShiftList;
    }

    public Gurdian getaGurdian() {
        return aGurdian;
    }

    public void setaGurdian(Gurdian aGurdian) {
        this.aGurdian = aGurdian;
    }

    public List<Shift> getShiftList() {
        return ShiftList;
    }

    public void setShiftList(List<Shift> ShiftList) {
        this.ShiftList = ShiftList;
    }

//    public int getId_patient() {
//        return id_patient;
//    }
//
//    public void setId_patient(int id_patient) {
//        this.id_patient = id_patient;
//    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }
    
    
    
}