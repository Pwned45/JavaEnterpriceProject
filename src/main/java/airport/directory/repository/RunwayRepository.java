package airport.directory.repository;


import airport.directory.model.Runway;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface RunwayRepository  extends JpaRepository<Runway, Long> {

}
