package group43.thesilentingredient.recipeIngredient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group43.thesilentingredient.recipe.Recipe;

@Service
public class RecipeIngredientService {

	private final RecipeIngredientRepository recipeIngredientRepository;
	
	@Autowired
	public RecipeIngredientService(RecipeIngredientRepository recipeIngredientRepository) {
		this.recipeIngredientRepository = recipeIngredientRepository;
	}
	
	public List<RecipeIngredient> getRecipeIngredient() {
		return recipeIngredientRepository.findAll();
	}
	
	public List<RecipeIngredient> retrieveRecipeIngredient(int recipe_id) {
		return recipeIngredientRepository.findIngredientsByRecipe_id(recipe_id);
	}

//	public void addIngredientToRecipe(RecipeIngredient recipeIngredient) {
//		List<RecipeIngredient> recipeIngredientOptional = recipeIngredientRepository.findIngredientsByRecipe_id(recipeIngredient.getRecipe_id());
//		if (recipeIngredientOptional.i) {
//			throw new IllegalStateException("Recipe taken!");
//		}
//
//		recipeIngredientRepository.save(recipeIngredient);
//		
//	}
//
//	public void deleteRecipeIngredient(Long recipeId) {
//		// TODO Auto-generated method stub
//		
//	}

}
