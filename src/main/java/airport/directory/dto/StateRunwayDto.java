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
public class StateRunwayDto {

    private String stateRun;

    private List<Runway> runwayList = new ArrayList<Runway>();
}
