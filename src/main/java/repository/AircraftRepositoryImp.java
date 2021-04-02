package repository;


import model.Aircraft;
import model.AircraftType;
import model.StateAircraft;

import java.util.ArrayList;
import java.util.List;

public class AircraftRepositoryImp implements  AircraftRepository {
    private List<Aircraft> list = new ArrayList<Aircraft>(){{
        add(new Aircraft("b1", 1, StateAircraft.Flying, AircraftType.Normal));
        add(new Aircraft("b2", 2, StateAircraft.Flying, AircraftType.Fast));
        add(new Aircraft("b3", 3, StateAircraft.Flying, AircraftType.Slow));
    }};
    @Override
    public Aircraft getById(Integer id) {
        return list.get(id);
    }

    @Override
    public void deleteById(Integer id) {
       list.remove((int)id);
    }

    @Override
    public List<Aircraft> getAll() {
        return list;
    }
}
