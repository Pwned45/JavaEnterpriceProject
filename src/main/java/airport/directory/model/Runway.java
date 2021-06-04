package airport.directory.model;

import lombok.Data;
import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "offerType")
@Data
public class Runway {
    @Id
    @Column(name = "id_Runway")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRunway;

    @Column(name = "number")
    private Integer num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_stateRun")
    private StateRunway stateRun;

    @Column(name = "time")
    private Time time;

}
