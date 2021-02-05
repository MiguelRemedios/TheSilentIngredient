package group43.thesilentingredient.ingredient;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long>{
	
	//SELECT * FROM ingredient WHERE name = ?
	@Query("SELECT r FROM Ingredient r WHERE r.name = ?1")
	Optional<Ingredient> findIngredientByName(String name);
	
}

