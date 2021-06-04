package airport.directory.mapper;

import airport.directory.dto.ScheduleTypeDto;
import airport.directory.model.ScheduleType;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface ScheduleTypeMapper {
    ScheduleType dtoToScheduleType(ScheduleTypeDto scheduleType_dto);

    ScheduleTypeDto scheduleTypeToDto(ScheduleType scheduleType);

    List<ScheduleType> listDtoToListScheduleType(List<ScheduleTypeDto> list_scheduleType_dto);

    List<ScheduleTypeDto> listScheduleTypeToListDto(List<ScheduleType> list_scheduleType);
}
