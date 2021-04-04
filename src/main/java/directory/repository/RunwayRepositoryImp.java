package directory.repository;

import directory.model.Runway;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class RunwayRepositoryImp implements  RunwayRepository{


    @Override
    public Runway getById(UUID uuid) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void add(Runway runway) {

    }

    @Override
    public List<Runway> getAll() {
        return null;
    }

    @Override
    public Runway getByNumber(Integer number) {
        return null;
    }
}
