package group43.thesilentingredient.recipe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path= "api/v1/recipe")

public class RecipeController {

	private final RecipeService recipeService;
	
	@Autowired
	public RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}
	
	@GetMapping
	public List<Recipe> getRecipes() {
		return recipeService.getRecipes();		
	}
	
}