package airport.directory.mapper;

import airport.directory.dto.RunwayDto;
import airport.directory.model.Runway;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface RunwayMapper {
    Runway dtoToRunway(RunwayDto runway_dto);

    RunwayDto runwayToDto(Runway runway);

    List<Runway> listDtoToListRunway(List<RunwayDto> list_runway_dto);

    List<RunwayDto> listRunwayToListDto(List<Runway> list_runway);
}
