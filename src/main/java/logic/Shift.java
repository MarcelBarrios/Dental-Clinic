
package logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Shift implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_shift;
    
    @Temporal(TemporalType.DATE)
    private Date shift_date;
    private String shift_hour;
    private String condition;
    
    @ManyToOne
    @JoinColumn(name="id_dentist")
    private Dentist dentis;
    
    @ManyToOne
    @JoinColumn(name="id_patient")
    private Patient patien;

    public Shift() {
    }

    public Shift(int id_shift, Date shift_date, String shift_hour, String condition, Dentist dentis) {
        this.id_shift = id_shift;
        this.shift_date = shift_date;
        this.shift_hour = shift_hour;
        this.condition = condition;
        this.dentis = dentis;
    }

    public int getId_shift() {
        return id_shift;
    }

    public void setId_shift(int id_shift) {
        this.id_shift = id_shift;
    }

    public Date getShift_date() {
        return shift_date;
    }

    public void setShift_date(Date shift_date) {
        this.shift_date = shift_date;
    }

    public String getShift_hour() {
        return shift_hour;
    }

    public void setShift_hour(String shift_hour) {
        this.shift_hour = shift_hour;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Dentist getDentis() {
        return dentis;
    }

    public void setDentis(Dentist dentis) {
        this.dentis = dentis;
    }
    
    
}