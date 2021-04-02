package repository;

import model.Aircraft;

import java.util.List;

public interface AircraftRepository {
    Aircraft getById (Integer id);
    void deleteById (Integer id);
    List<Aircraft> getAll();

}
