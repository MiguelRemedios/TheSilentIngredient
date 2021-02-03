package group43.thesilentingredient.recipeIngredient;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long>{

	//SELECT * FROM recipe_ingredient WHERE recipe_id = ?;
	@Query("SELECT x FROM RecipeIngredient x WHERE x.recipe_id = ?1")
	List<RecipeIngredient> findIngredientsByRecipe_id(Integer recipe_id);

	//SELECT count(recipe_id) FROM recipe_ingredient;
	@Query("SELECT count(*) FROM RecipeIngredient WHERE recipe_id = ?1")
	List<RecipeIngredient> countIngredients(Integer recipe_id);
	
	@Query("SELECT i FROM RecipeIngredient i WHERE i.recipe_id = ?1 AND i.ingredient_id = ?2")
	Optional<RecipeIngredient> repeatIngredient(Integer recipe_id, Integer ingredient_id);


		

}