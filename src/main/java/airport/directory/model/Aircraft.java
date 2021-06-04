package airport.directory.model;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "aircraft")
@Data
public class Aircraft {
    @Id
    @Column(name = "id_Aircraft")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAircraft;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private Integer number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_stateАir")
    private StateAircraft stateAir;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_typeAir")
    private AircraftType typeAircraft;




}
