
package logic;

import java.util.Date;

public class Shift {
    private int id_turn;
    private Date turn_date;
    private String turn_hour;
    private String condition;

    public Shift() {
    }

    public Shift(int id_turn, Date turn_date, String turn_hour, String condition) {
        this.id_turn = id_turn;
        this.turn_date = turn_date;
        this.turn_hour = turn_hour;
        this.condition = condition;
    }

    public int getId_turn() {
        return id_turn;
    }

    public void setId_turn(int id_turn) {
        this.id_turn = id_turn;
    }

    public Date getTurn_date() {
        return turn_date;
    }

    public void setTurn_date(Date turn_date) {
        this.turn_date = turn_date;
    }

    public String getTurn_hour() {
        return turn_hour;
    }

    public void setTurn_hour(String turn_hour) {
        this.turn_hour = turn_hour;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    
}