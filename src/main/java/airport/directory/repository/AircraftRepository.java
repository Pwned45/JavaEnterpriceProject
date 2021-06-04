package airport.directory.repository;

import airport.directory.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
}
