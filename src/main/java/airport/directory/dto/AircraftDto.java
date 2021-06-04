package airport.directory.dto;

import airport.directory.model.AircraftType;
import airport.directory.model.StateAircraft;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AircraftDto {

    private String name;

    private Integer number;

    private StateAircraft stateAir;

    private AircraftType typeAircraft;

}
