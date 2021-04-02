package service;

import model.Aircraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AircraftRepository;

import java.util.List;
import java.util.UUID;

@Service
public class AircraftService {
    @Autowired
    private AircraftRepository aircraftRepository;

    public void add(Aircraft aircraft){
        aircraftRepository.add(aircraft);
    }

    public void deleteByUuid(UUID uuid) {
        aircraftRepository.deleteById(uuid);
    }

    public List<Aircraft> getAll(){
        return aircraftRepository.getAll();
    }
}
