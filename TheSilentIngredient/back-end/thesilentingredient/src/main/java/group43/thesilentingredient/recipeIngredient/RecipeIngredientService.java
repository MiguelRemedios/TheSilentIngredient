package group43.thesilentingredient.recipeIngredient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
//	public Optional<RecipeIngredient> retrieveRecipeIngredient(int recipe_id) {
//		return recipeIngredientRepository.findRecipeByIngredients(recipe_id);
//	}

}
