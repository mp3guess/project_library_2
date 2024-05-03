package repositories;

import models.Person;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer>{
}
