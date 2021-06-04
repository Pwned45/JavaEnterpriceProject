package airport.directory.mapper;

import airport.directory.dto.AircraftTypeDto;
import airport.directory.model.AircraftType;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface AircraftTypeMapper {
    AircraftType dtoToAircraftType(AircraftTypeDto aircraftType_dto);

    AircraftTypeDto aircraftTypeToDto(AircraftType aircraftType);

    List<AircraftType> listDtoToListAircraftType(List<AircraftTypeDto> list_aircraftType_dto);

    List<AircraftTypeDto> listAircraftTypeToListDto(List<AircraftType> list_aircraftType);
}
