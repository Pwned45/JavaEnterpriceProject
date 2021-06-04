package airport.directory.dto;

import airport.directory.model.ScheduleType;
import airport.directory.model.StateRunway;
import lombok.*;

import java.sql.Time;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RunwayDto {

    private Integer num;

    private StateRunway stateRun;

    private Time time;
}
