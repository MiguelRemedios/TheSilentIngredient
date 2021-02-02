package group43.thesilentingredient.diet;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DietRepository extends JpaRepository<Diet, Long> {

	// SELECT * FROM diet WHERE name = ?
	@Query("SELECT r FROM Diet r WHERE r.name = ?1")
	Optional<Diet> findDietByName(String name);

	// SELECT * FROM diet WHERE description = ?
	@Query("SELECT d FROM Diet d WHERE d.description = ?1")
	Optional<Diet> findDietByDescription(String description);

}
