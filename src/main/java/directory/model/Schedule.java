package directory.model;

import java.util.LinkedList;

public class Schedule {

    private LinkedList<Offer> schedule = new LinkedList<>();
    private ScheduleType type;

    public Schedule(LinkedList<Offer> schedule, ScheduleType type) {
        this.schedule = schedule;
        this.type = type;
    }

    public Schedule() {
    }

    public LinkedList<Offer> getSchedule() {
        return schedule;
    }

    public void setSchedule(LinkedList<Offer> schedule) {
        this.schedule = schedule;
    }

    public ScheduleType getType() {
        return type;
    }

    public void setType(ScheduleType type) {
        this.type = type;
    }
}
