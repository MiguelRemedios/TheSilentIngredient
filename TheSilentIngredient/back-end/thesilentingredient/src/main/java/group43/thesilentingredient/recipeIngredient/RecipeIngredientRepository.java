package group43.thesilentingredient.recipeIngredient;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long>{

	//SELECT * FROM recipe WHERE name = ?
	//SELECT * FROM recipe_ingredient WHERE recipe_id = 1;
	
//	@Query("SELECT x FROM recipe_ingredient x WHERE x.recipe_id = ?1")
//	Optional<RecipeIngredient> findRecipeByIngredients(int recipe_id);

//	//SELECT * FROM recipe WHERE description = ?
//	@Query("SELECT m FROM Recipe_Ingredient m WHERE m.measurement = ?1")
//	Optional<RecipeIngredient> findRecipeByDescription(String measurement);

}