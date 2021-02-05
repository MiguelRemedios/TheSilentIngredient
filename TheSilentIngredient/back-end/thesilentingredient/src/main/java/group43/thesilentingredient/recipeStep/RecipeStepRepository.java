package group43.thesilentingredient.recipeStep;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeStepRepository extends JpaRepository<RecipeStep, Long>{
	//SELECT * FROM recipe_step WHERE recipe_id = ?;
	@Query("SELECT x FROM RecipeStep x WHERE x.step_id = ?1")
	Optional<RecipeStep> findStep(Integer step_id);

}
