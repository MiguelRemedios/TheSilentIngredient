package group43.thesilentingredient.recipeStep;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<RecipeStep> getStep() {
		return recipeStepService.getRecipeStep();		
	}
	
	@GetMapping(path = "{id}")
	public Optional<RecipeStep> retrieveStep(@PathVariable("id") Long stepId){
		return recipeStepService.retrieveRecipeStep(stepId);
	}
	
}