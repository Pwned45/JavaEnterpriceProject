package airport.directory.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "offerType")
@Data
public class OfferType {
    @Id
    @Column(name = "id_offerType")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOfferType;

    @Column(name = "offerType")
    private String offerType;

    @OneToMany(mappedBy = "offerType")
    private List<Offer> offerList = new ArrayList<Offer>();
}
