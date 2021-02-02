package group43.thesilentingredient.recipeIngredient;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import group43.thesilentingredient.recipe.Recipe;

@Repository
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long>{

	//SELECT * FROM recipe_ingredient WHERE recipe_id = ?;
	@Query("SELECT x FROM RecipeIngredient x WHERE x.recipe_id = ?1")
	List<RecipeIngredient> findIngredientsByRecipe_id(int recipe_id);

	//SELECT count(recipe_id) FROM recipe_ingredient;
	@Query("SELECT count(*) FROM RecipeIngredient WHERE recipe_id = ?1")
	List<RecipeIngredient> countIngredients(int recipe_id);

		

}