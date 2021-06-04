package airport.directory.dto;

import airport.directory.model.Offer;
import airport.directory.model.ScheduleType;
import lombok.*;

import java.util.LinkedList;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ScheduleDto {

    private LinkedList<Offer> offers = new LinkedList<Offer>();

    private ScheduleType typeSchel;
}
