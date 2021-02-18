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
	
	public Optional<RecipeStep> retrieveRecipeStep(Long stepId) {
		return recipeStepRepository.findById(stepId);
	}

	public List<RecipeStep> retrieveRecipeSteps(Integer recipe_id) {
		return recipeStepRepository.findIngredientsByRecipeID(recipe_id);
	}
	
	public void addNewStep(RecipeStep recipe_step) {
		Optional<RecipeStep> recipeStepOptional = recipeStepRepository.findStep(recipe_step.getStep_id());

		if (recipeStepOptional.isPresent()) {
			throw new IllegalStateException("Step taken!");
		}

		recipeStepRepository.save(recipe_step);
	}


	public void deleteStep(Long stepId) {

		boolean exists = recipeStepRepository.existsById(stepId);

		if(!exists) {
			throw new IllegalStateException("Recipe with ID " + stepId + " does not exist!");
		}

		recipeStepRepository.deleteById(stepId);
	}
	
}
