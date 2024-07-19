
package logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedule implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_schedule;
    private String turn_date;
    private String turn_hour;

    public Schedule() {
    }

    public Schedule(int id_schedule, String turn_date, String turn_hour) {
        this.id_schedule = id_schedule;
        this.turn_date = turn_date;
        this.turn_hour = turn_hour;
    }

    public int getId_schedule() {
        return id_schedule;
    }

    public void setId_schedule(int id_schedule) {
        this.id_schedule = id_schedule;
    }

    public String getTurn_date() {
        return turn_date;
    }

    public void setTurn_date(String turn_date) {
        this.turn_date = turn_date;
    }

    public String getTurn_hour() {
        return turn_hour;
    }

    public void setTurn_hour(String turn_hour) {
        this.turn_hour = turn_hour;
    }
    
    
}