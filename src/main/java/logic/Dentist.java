package logic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dentist extends Person implements Serializable {

//    private int id_dentist;
    private String speciality;
    
    @OneToMany(mappedBy="dentis")
    private List<Shift> ShiftList;
    
    @OneToOne
    private User aUser;
    
    @OneToOne
    private Schedule aSchedule;

    public Dentist() {
    }

    public Dentist(String speciality, List<Shift> ShiftList, User aUser, Schedule aSchedule, int id, String identification, String name, String last_name, String phone, String address, Date dob) {
        super(id, identification, name, last_name, phone, address, dob);
        this.speciality = speciality;
        this.ShiftList = ShiftList;
        this.aUser = aUser;
        this.aSchedule = aSchedule;
    }

//    public int getId_dentist() {
//        return id_dentist;
//    }
//
//    public void setId_dentist(int id_dentist) {
//        this.id_dentist = id_dentist;
//    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Shift> getShiftList() {
        return ShiftList;
    }

    public void setShiftList(List<Shift> ShiftList) {
        this.ShiftList = ShiftList;
    }

    public User getaUser() {
        return aUser;
    }

    public void setaUser(User aUser) {
        this.aUser = aUser;
    }

    public Schedule getaSchedule() {
        return aSchedule;
    }

    public void setaSchedule(Schedule aSchedule) {
        this.aSchedule = aSchedule;
    }
    
    
}