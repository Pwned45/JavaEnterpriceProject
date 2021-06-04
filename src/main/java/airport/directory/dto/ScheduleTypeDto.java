package airport.directory.dto;

import airport.directory.model.Schedule;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ScheduleTypeDto {

    private String scheduleType;

    private List<Schedule> scheduleList = new ArrayList<Schedule>();
}
