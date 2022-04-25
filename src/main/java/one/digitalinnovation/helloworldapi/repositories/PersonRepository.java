package one.digitalinnovation.helloworldapi.repositories;

import one.digitalinnovation.helloworldapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
