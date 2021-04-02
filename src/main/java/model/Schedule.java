package model;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

public class Schedule {

    private Map<Aircraft, Time>  schedule = new HashMap<>();
    private ScheduleType type;

    public Schedule(Map<Aircraft, Time> schedule, ScheduleType type) {
        this.schedule = schedule;
        this.type = type;
    }

    public Schedule() {
    }

    public Map<Aircraft, Time> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<Aircraft, Time> schedule) {
        this.schedule = schedule;
    }

    public ScheduleType getType() {
        return type;
    }

    public void setType(ScheduleType type) {
        this.type = type;
    }
}
