package homework_17.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UnivercityRepository extends JpaRepository<Univercity, Long>, CrudRepository<Univercity, Long> {

}
