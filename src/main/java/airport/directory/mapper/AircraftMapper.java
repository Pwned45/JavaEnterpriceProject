package airport.directory.mapper;

import airport.directory.dto.AircraftDto;
import airport.directory.model.Aircraft;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface AircraftMapper {
    Aircraft dtoToAircraft(AircraftDto aircraft_dto);

    AircraftDto aircraftToDto(Aircraft aircraft);

    List<Aircraft> listDtoToListAircraft(List<AircraftDto> list_aircraft_dto);

    List<AircraftDto> listAircraftToListDto(List<Aircraft> list_aircraft);
}
