package airport.directory.model;
import lombok.Data;

import javax.persistence.*;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stateRunway")
@Data
public class StateRunway {
    @Id
    @Column(name = "id_stateRun")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStateRun;

    @Column(name = "stateRun")
    private String stateRun;

    @OneToMany(mappedBy = "stateRun")
    private List<Runway> runwayList = new ArrayList<Runway>();
}
