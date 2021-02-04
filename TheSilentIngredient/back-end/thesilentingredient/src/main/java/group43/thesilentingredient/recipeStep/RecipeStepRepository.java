package group43.thesilentingredient.recipeStep;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeStepRepository extends JpaRepository<RecipeStep, Long>{
	//SELECT * FROM recipe_step WHERE recipe_id = ?;
	@Query("SELECT x FROM RecipeStep x WHERE x.recipe_id = ?1")
	List<RecipeStep> findStepsByRecipe_id(String step);

	//SELECT count(recipe_id) FROM recipe_step;
	@Query("SELECT count(*) FROM RecipeStep WHERE recipe_id = ?1")
	List<RecipeStep> countSteps(Integer step_id);

	//SELECT count(recipe_id) FROM recipe_step;
	
}
