package repository;


import model.Runway;

import java.util.List;
import java.util.UUID;

public interface RunwayRepository {
    Runway getById (UUID uuid);
    void deleteById (UUID uuid);
    void add(Runway runway);
    List<Runway> getAll();
    Runway getByNumber(Integer number);
}
