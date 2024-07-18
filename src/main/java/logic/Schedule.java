
package logic;


public class Schedule {
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