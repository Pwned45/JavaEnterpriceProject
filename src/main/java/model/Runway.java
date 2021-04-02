package model;

import java.sql.Time;
import java.util.UUID;

public class Runway {
    private int num;
    private StateRunway state;
    private UUID uuid = UUID.randomUUID();
    private Time time;
    public Runway(Integer number, StateRunway state) {
        this.num = number;
        this.state = state;
    }
    public Time getTime() { return time; }

    public void setTime(Time time) { this.time = time; }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public StateRunway getState() {
        return state;
    }

    public void setState(StateRunway state) {
        this.state = state;
    }
}
