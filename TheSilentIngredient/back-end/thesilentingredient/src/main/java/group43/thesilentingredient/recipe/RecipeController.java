package group43.thesilentingredient.recipe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path= "api/v1/recipe")
@CrossOrigin(origins = "*")

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

	@GetMapping(path = "{id}")
	public Optional<Recipe> retrieveRecipe(@PathVariable("id") Long recipeId){
		return recipeService.retrieveRecipe(recipeId);
	}

	@PostMapping
	public void registerRecipe(@RequestBody Recipe recipe) {
		recipeService.addNewRecipe(recipe);
	}

	@DeleteMapping(path = "{recipeId}")
	public void deleteRecipe(@PathVariable("recipeId") Long recipeId) {
		recipeService.deleteRecipe(recipeId);
	}

	@PutMapping(path = "{recipeId}")
	public void updateRecipe(@PathVariable("recipeId") Long recipeId,
			@RequestParam(required = false) String recipeName,
			@RequestParam(required = false) String recipeDesc,
			@RequestParam(required = false) int serving,
			@RequestParam(required = false) String cooktime) {
		recipeService.updateRecipe(recipeId, recipeName, recipeDesc, serving, cooktime);
	}
}