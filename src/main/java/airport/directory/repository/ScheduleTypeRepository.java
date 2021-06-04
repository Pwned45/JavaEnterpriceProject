package airport.directory.repository;

import airport.directory.model.ScheduleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleTypeRepository extends JpaRepository<ScheduleType, Long> {
}
