package repository;

import model.Aircraft;
import model.Offer;
import model.OfferType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Repository
public class OfferRepositoryImp implements  OfferRepository {
    @Autowired
    private AircraftRepository aircraftRepository;

    private List<Offer> data = new ArrayList<>();

    @PostConstruct
    private void init() {
        List<Aircraft> aircrafts = aircraftRepository.getAll();

        for (Aircraft aircraft : aircrafts) {
            data.add(new Offer(
                    aircraft,
                    OfferType.IN_PROGRESS,
                    new Time((int) (Math.random() * 23), (int) (Math.random() * 59), (int) (Math.random() * 59)))
            );
        }
    }
    @Override
    public Offer getById(UUID uuid) {
        return data.stream().filter(curr -> Objects.equals(curr.getUuid(), uuid)).findFirst().orElse(null);
    }

    @Override
    public void deleteById(UUID uuid) {
        data.removeIf(curr -> Objects.equals(curr.getUuid(), uuid));
    }

    @Override
    public void add(Offer offer) {
        data.add(offer);
    }

    @Override
    public List<Offer> getAll() {
        return data;
    }
}
