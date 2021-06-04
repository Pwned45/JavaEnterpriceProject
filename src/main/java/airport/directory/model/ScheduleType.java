package airport.directory.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "scheduleType")
@Data
public class ScheduleType {
    @Id
    @Column(name = "id_scheduleType")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idScheduleType;

    @Column(name = "scheduleType")
    private String scheduleType;

    @OneToMany(mappedBy = "scheduleType")
    private List<Schedule> scheduleList = new ArrayList<Schedule>();
}
