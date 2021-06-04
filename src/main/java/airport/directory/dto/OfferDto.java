package airport.directory.dto;

import airport.directory.model.Aircraft;
import airport.directory.model.OfferType;
import airport.directory.model.Schedule;
import lombok.*;

import java.sql.Time;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OfferDto {

    private Aircraft aircraft;

    private OfferType type;

    private Time plainedTime;

    private Time realisticTime;

    private Schedule schedule;
}
