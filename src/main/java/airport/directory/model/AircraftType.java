package airport.directory.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "aircraftType")
@Data
public class AircraftType {
    @Id
    @Column(name = "id_aircraftType")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAircraftType;

    @Column(name = "aircraftType")
    private String aircraftType;

    @OneToMany(mappedBy = "aircraftType")
    private List<Aircraft> aircraftList = new ArrayList<Aircraft>();
}
