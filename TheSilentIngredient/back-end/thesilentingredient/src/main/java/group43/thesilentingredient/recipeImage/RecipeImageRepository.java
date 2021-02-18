package group43.thesilentingredient.recipeImage;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import group43.thesilentingredient.recipeIngredient.RecipeIngredient;

@Repository
public interface RecipeImageRepository extends JpaRepository<RecipeImage, Long>{
	
	//SELECT * FROM recipe_image WHERE recipeNr = ?
	@Query("SELECT n FROM RecipeImage n WHERE n.recipeNr = ?1")
	Optional<RecipeImage> findRecipeImageByNr(int recipeNr);
	
	//SELECT * FROM recipeimage_sequence WHERE path = ?
	@Query("SELECT p FROM RecipeImage p WHERE p.path = ?1")
	Optional<RecipeImage> findRecipeImageByPath(String path);
	
	@Query("SELECT x FROM RecipeImage x WHERE x.recipeNr = ?1")
	List<RecipeImage> findIngredientsByRecipeNr(Integer recipeNr);
	
}
