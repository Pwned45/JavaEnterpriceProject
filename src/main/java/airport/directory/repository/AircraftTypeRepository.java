package airport.directory.repository;

import airport.directory.model.AircraftType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftTypeRepository extends JpaRepository<AircraftType, Long> {
}
