package airport.directory.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "offer")
@Data
public class Offer {
    @Id
    @Column(name = "id_Offer")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOffer;

    @OneToMany(mappedBy = "aircraft")
    @JoinColumn(name = "fk_aircraft")
    private Aircraft aircraft;

    @OneToMany(mappedBy = "offerType")
    @JoinColumn(name = "fk_offerType")
    private OfferType type;

    @Column(name = "plainedTime")
    private Time plainedTime;

    @Column(name = "realisticTime")
    private Time realisticTime;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

}
