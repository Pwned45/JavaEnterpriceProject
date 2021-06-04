package airport.directory.model;

import lombok.Data;

import javax.persistence.*;
import java.util.LinkedList;

@Entity
@Table(name = "schedule")
@Data
public class Schedule {
    @Id
    @Column(name = "id_Schedule")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSchedule;

    @OneToMany(mappedBy = "schedule")
    private LinkedList<Offer> offers = new LinkedList<Offer>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_typeSchel")
    private ScheduleType typeSchel;


}
