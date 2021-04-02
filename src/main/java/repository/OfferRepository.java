package repository;

import model.Offer;

import java.util.List;
import java.util.UUID;

public interface OfferRepository {
    Offer getById (UUID uuid);
    void deleteById (UUID uuid);
    void add(Offer offer);
    List<Offer> getAll();
}
