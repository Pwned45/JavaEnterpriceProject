package airport.directory.mapper;

import airport.directory.dto.ScheduleDto;
import airport.directory.model.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface ScheduleMapper {
    Schedule dtoToSchedule(ScheduleDto schedule_dto);

    ScheduleDto scheduleToDto(Schedule schedule);

    List<Schedule> listDtoToListSchedule(List<ScheduleDto> list_schedule_dto);

    List<ScheduleDto> listScheduleToListDto(List<Schedule> list_schedule);
}
