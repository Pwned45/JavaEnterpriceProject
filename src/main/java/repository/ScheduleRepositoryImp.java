package repository;

import model.Offer;
import model.Schedule;
import model.ScheduleType;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.*;

@Repository
public class ScheduleRepositoryImp implements  ScheduleRepository {
    private List<Schedule> list = new ArrayList<Schedule>(){{
        add(new Schedule(new LinkedList<Offer>(), ScheduleType.DAILY));
    }};
    @Override
    public Schedule getById(Integer id) {
        return list.get(id);
    }

    @Override
    public List<Schedule> getAll() {
        return list;
    }

    @Override
    public void deleteById(UUID uuid) {

    }
}
