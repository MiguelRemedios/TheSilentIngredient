package group43.thesilentingredient.recipeImage;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeImageRepository extends JpaRepository<RecipeImage, Long>{
	
	//SELECT * FROM recipe_image WHERE recipeNr = ?
	@Query("SELECT n FROM RecipeImage n WHERE n.recipeId = ?1")
	Optional<RecipeImage> findRecipeImageById(int recipeId);
	
	//SELECT * FROM recipeimage_sequence WHERE path = ?
	@Query("SELECT p FROM RecipeImage p WHERE p.path = ?1")
	Optional<RecipeImage> findRecipeImageByPath(String path);
	
}
