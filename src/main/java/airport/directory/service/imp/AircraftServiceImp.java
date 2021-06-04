package airport.directory.service.imp;

import airport.directory.dto.AircraftDto;
import airport.directory.mapper.AircraftMapper;
import airport.directory.model.Aircraft;
import airport.directory.repository.AircraftRepository;
import airport.directory.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AircraftServiceImp implements AircraftService {

    @Autowired
    private AircraftRepository aircraftRepository;
    @Autowired
    private AircraftMapper aircraftMapper;

    @Override
    public List<AircraftDto> getAllAircraft() {
        List<Aircraft> age_limits = aircraftRepository.findAll();
        return aircraftMapper.listAircraftToListDto(age_limits);
    }

    @Override
    public void deleteAllAircraft() {
        aircraftRepository.deleteAll();
    }

    @Override
    public AircraftDto getAircraftById(Long aircraft_id) {
        Optional<Aircraft> age_limit = aircraftRepository.findById(aircraft_id);
        return age_limit.map(aircraftMapper::aircraftToDto).orElse(null);
    }

    @Override
    public AircraftDto addAircraft(AircraftDto aircraft_dto) {
        Aircraft aircraft = aircraftMapper.dtoToAircraft(aircraft_dto);
        aircraft = aircraftRepository.save(aircraft);
        return aircraftMapper.aircraftToDto(aircraft);
    }

    @Override
    public void deleteAircraftById(Long aircraft_id) {
        aircraftRepository.deleteById(aircraft_id);
    }


}
