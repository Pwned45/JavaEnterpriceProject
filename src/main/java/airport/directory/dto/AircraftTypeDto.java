package airport.directory.dto;

import airport.directory.model.Runway;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AircraftTypeDto {

    private String aircraftType;

    private List<Runway> runwayList = new ArrayList<Runway>();
}
