package airport.directory.mapper;

import airport.directory.dto.StateAircraftDto;
import airport.directory.model.StateAircraft;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface StateAircraftMapper {
    StateAircraft dtoToStateAircraft(StateAircraftDto state_aircraft_dto);

    StateAircraftDto stateAircraftToDto(StateAircraft state_aircraft);

    List<StateAircraft> listDtoToListStateAircraft(List<StateAircraftDto> list_state_aircraft_dto);

    List<StateAircraftDto> listStateAircraftToListDto(List<StateAircraft> list_state_aircraft);
}
