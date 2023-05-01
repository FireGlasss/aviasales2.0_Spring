package net.proselyte.aviasales2._S.service;

import net.proselyte.aviasales2._S.model.Place;
import net.proselyte.aviasales2._S.model.User;
import net.proselyte.aviasales2._S.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
    private final PlaceRepository placeRepository;

    @Autowired
    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Place findById(int id) {
        return placeRepository.findById(id).orElse(null);
    }

    public List<Place> findAll() {
        return placeRepository.findAll();
    }

    public Place savePlace(Place place) {
        return placeRepository.save(place);
    }

    public void deleteById(Integer id) {
        placeRepository.deleteById(id);
    }
}
