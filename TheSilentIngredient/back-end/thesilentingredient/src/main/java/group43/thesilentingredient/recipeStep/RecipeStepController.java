package group43.thesilentingredient.recipeStep;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/recipe-step")
public class RecipeStepController {
	
	private final RecipeStepService recipeStepService;
	
	@Autowired
	public RecipeStepController(RecipeStepService recipeStepService) {
		this.recipeStepService = recipeStepService;
	}
	
	@GetMapping
	public List<RecipeStep> getSteps() {
		return recipeStepService.getRecipeStep();		
	}
	
	@GetMapping(path = "{id}")
	public Optional<RecipeStep> retrieveStep(@PathVariable("id") Long stepId){
		return recipeStepService.retrieveRecipeStep(stepId);
	}
	
	@PostMapping
	public void registerRecipe(@RequestBody RecipeStep recipe_step) {
		recipeStepService.addNewStep(recipe_step);
	}

	@DeleteMapping(path = "{stepId}")
	public void deleteRecipe(@PathVariable("stepId") Long stepId) {
		recipeStepService.deleteStep(stepId);
	}

	
}