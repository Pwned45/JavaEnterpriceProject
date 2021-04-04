package directory.repository;

import directory.model.Aircraft;

import java.util.List;
import java.util.UUID;

public interface AircraftRepository {
    Aircraft getById (UUID uuid);
    void deleteById (UUID uuid);
    void add(Aircraft aircraft);
    List<Aircraft> getAll();
    Aircraft getByNumber(Integer number);

}
