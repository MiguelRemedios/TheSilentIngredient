package group43.thesilentingredient.recipeStep;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeStepService {

	private final RecipeStepRepository recipeStepRepository;
	
	@Autowired
	public RecipeStepService(RecipeStepRepository recipeIngredientRepository) {
		this.recipeStepRepository = recipeIngredientRepository;
	}
	
	public List<RecipeStep> getRecipeStep() {
		return recipeStepRepository.findAll();
	}
	
	
	public List<RecipeStep> retrieveRecipeStep(String step) {
		return recipeStepRepository.findStepsByRecipe_id(step);
	}

	
}
