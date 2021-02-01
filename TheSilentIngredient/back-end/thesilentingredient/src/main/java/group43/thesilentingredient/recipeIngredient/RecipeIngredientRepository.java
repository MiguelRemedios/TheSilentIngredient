package group43.thesilentingredient.recipeIngredient;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import group43.thesilentingredient.recipe.Recipe;


@Repository
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long>{
	
//	//SELECT * FROM recipe WHERE name = ?
//	@Query("SELECT r FROM Recipe r WHERE r.name = ?1")
//	Optional<Recipe> findRecipeByName(String name);
//	
//	//SELECT * FROM recipe WHERE description = ?
//	@Query("SELECT d FROM Recipe d WHERE d.description = ?1")
//	Optional<Recipe> findRecipeByDescription(String description);
	
}