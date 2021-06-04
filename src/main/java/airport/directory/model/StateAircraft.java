package airport.directory.model;

import lombok.Data;

import javax.persistence.*;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stateAircraft")
@Data
public class StateAircraft {
    @Id
    @Column(name = "id_stateAir")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStateAir;

    @Column(name = "stateAir")
    private String stateAir;

    @OneToMany(mappedBy = "stateAir")
    private List<Aircraft> aircraftList = new ArrayList<Aircraft>();
}
