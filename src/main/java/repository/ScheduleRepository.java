package repository;

import model.Schedule;


import java.util.List;

public interface ScheduleRepository {
    Schedule getById (Integer id);
    void deleteById (Integer id);
    List<Schedule> getAll();
}
