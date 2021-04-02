package repository;

import model.Aircraft;
import model.Schedule;
import model.ScheduleType;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ScheduleRepositoryImp implements  ScheduleRepository {
    private List<Schedule> list = new ArrayList<Schedule>(){{
        add(new Schedule(new HashMap<Aircraft, Time>(), ScheduleType.Daily));
    }};
    @Override
    public Schedule getById(Integer id) {
        return list.get(id);
    }

    @Override
    public void deleteById(Integer id) {
        list.remove((int)id);
    }

    @Override
    public List<Schedule> getAll() {
        return list;
    }
}
