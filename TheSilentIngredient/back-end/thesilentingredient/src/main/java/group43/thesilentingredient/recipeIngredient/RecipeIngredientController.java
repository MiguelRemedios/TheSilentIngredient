package group43.thesilentingredient.recipeIngredient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/recipe-ingredient")
public class RecipeIngredientController {
	
	private final RecipeIngredientService recipeIngredientService;
	
	@Autowired
	public RecipeIngredientController(RecipeIngredientService recipeIngredientService) {
		this.recipeIngredientService = recipeIngredientService;
	}
	
	@GetMapping
	public List<RecipeIngredient> getRecipeIngredient() {
		return recipeIngredientService.getRecipeIngredient();		
	}
	
//	@GetMapping(path = "{recipe_id}")
//	public Optional<RecipeIngredient> retrieveRecipeIngredient(@PathVariable("recipe_id") int recipe_id){
//		return recipeIngredientService.retrieveRecipeIngredient(recipe_id);
//	}
	
	
}
