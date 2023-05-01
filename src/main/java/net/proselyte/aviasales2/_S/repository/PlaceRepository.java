package net.proselyte.aviasales2._S.repository;

import net.proselyte.aviasales2._S.model.Place;
import net.proselyte.aviasales2._S.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {

}
