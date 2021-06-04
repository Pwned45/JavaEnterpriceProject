package airport.directory.mapper;

import airport.directory.dto.StateRunwayDto;
import airport.directory.model.StateRunway;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface StateRunwayMapper {
    StateRunway dtoToStateRunway(StateRunwayDto state_runway_dto);

    StateRunwayDto stateRunwayToDto(StateRunway state_runway);

    List<StateRunway> listDtoToListStateRunway(List<StateRunwayDto> list_state_runway_dto);

    List<StateRunwayDto> listStateRunwayToListDto(List<StateRunway> list_state_runway);
}
