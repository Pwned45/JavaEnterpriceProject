package airport.directory.dto;

import airport.directory.model.Aircraft;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class StateAircraftDto {

    private String stateAir;

    private List<Aircraft> aircraftList = new ArrayList<Aircraft>();
}
