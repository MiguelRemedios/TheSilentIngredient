package group43.thesilentingredient.recipeIngredient;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/recipe-ingredient")
@CrossOrigin(origins = "*")
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
	
	@GetMapping(path = "{recipe_id}")
    public Optional<RecipeIngredient> retrieveRecipeIngredient(@PathVariable("recipe_id") Long recipe_id){
        return recipeIngredientService.retrieveRecipeIngredient(recipe_id);
    }
	
	@PostMapping
	public void registerRecipeIngredient(@RequestBody RecipeIngredient recipeIngredient) {
		recipeIngredientService.addIngredientToRecipe(recipeIngredient);
	}
	//Deletes all ingredients for recipe_id thats passed through
    @DeleteMapping(path = "{recipe_id}")
    public void deleteRecipeIngredient(@PathVariable("recipe_id") Long recipe_id) {
        recipeIngredientService.deleteRecipeIngredient(recipe_id);
    }
    
    @PutMapping(path = "{recipeId}")
    public void updateRecipe(@PathVariable("recipeId") Long id,
            @RequestParam(required = false) Integer ingredient_id,
            @RequestParam(required = false) Integer recipe_id,
            @RequestParam(required = false) Double quantity,
            @RequestParam(required = false) String measurement) {
        recipeIngredientService.updateRecipeIngredient(id, ingredient_id, recipe_id, quantity, measurement);
    }
}
