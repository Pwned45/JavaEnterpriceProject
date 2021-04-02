package repository;


import model.Aircraft;
import model.AircraftType;
import model.StateAircraft;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Repository
public class AircraftRepositoryImp implements  AircraftRepository {
    private List<Aircraft> list = new ArrayList<Aircraft>(){{
        add(new Aircraft("b1", 1, StateAircraft.FLYING, AircraftType.NORMAL));
        add(new Aircraft("b2", 2, StateAircraft.FLYING, AircraftType.FAST));
        add(new Aircraft("b3", 3, StateAircraft.FLYING, AircraftType.SLOW));
    }};
    @Override
    public Aircraft getById(UUID uuid) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {
        list.removeIf(curr -> Objects.equals(curr.getUuid(), uuid));
    }

    @Override
    public void add(Aircraft aircraft) {
        list.add(aircraft);
    }

    @Override
    public List<Aircraft> getAll() {
        return list;
    }

    @Override
    public Aircraft getByNumber(Integer number) {
        return null;
    }
}
