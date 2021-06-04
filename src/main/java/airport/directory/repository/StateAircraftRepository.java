package airport.directory.repository;

import airport.directory.model.StateAircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateAircraftRepository extends JpaRepository<StateAircraft, Long> {
}
