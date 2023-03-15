package system.managment.pharmacy.pharmacy.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.managment.pharmacy.pharmacy.system.entities.Drug;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Long> {


}
