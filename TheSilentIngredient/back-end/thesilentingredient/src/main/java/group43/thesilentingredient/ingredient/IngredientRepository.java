package group43.thesilentingredient.ingredient;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long>{
	
	//SELECT * FROM ingredient WHERE name = ?
	@Query("SELECT r FROM Ingredient r WHERE r.name = ?1")
	Optional<Recipe> findIngredientByName(String name);
	   
	//SELECT * FROM ingredient WHERE description = ?
	@Query("SELECT d FROM Ingredient d WHERE d.description = ?1")
	Optional<Ingredient> findIngredientByDescription(String description);
	
}

