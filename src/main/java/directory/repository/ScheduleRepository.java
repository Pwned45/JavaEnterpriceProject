package directory.repository;

import directory.model.Schedule;


import java.util.List;
import java.util.UUID;

public interface ScheduleRepository {
    Schedule getById (Integer id);
    List<Schedule> getAll();
    void deleteById (UUID uuid);
}
