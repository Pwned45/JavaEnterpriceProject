package airport.directory.service;

import airport.directory.dto.AircraftDto;

import java.util.List;

public interface AircraftService {
    List<AircraftDto> getAllAircraft();

    void deleteAllAircraft();

    AircraftDto getAircraftById(Long aircraft_id);

    AircraftDto addAircraft(AircraftDto aircraft_dto);

    void deleteAircraftById(Long aircraft_id);


}
