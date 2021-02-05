package group43.thesilentingredient.ingredient;

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

/*@RestController
@RequestMapping(path= "api/v1/recipe")
@CrossOrigin(origins = "*")

public class IngredientController {

	private final IngredientService ingredientService;

	@Autowired
	public IngredientController(IngredientService ingredientService) {
		this.ingredientService = ingredientService;
	}

	@GetMapping
	public List<Ingredient> getIngredient() {
		return ingredientService.getIngredient();		
	}

	@GetMapping(path = "{id}")
	public Optional<Ingredient> retrieveIngredient(@PathVariable("id") Long ingredientId){
		return ingredientService.retrieveIngredient(ingredientId);
	}

	@PostMapping
	public void registerIngredient(@RequestBody Ingredient ingredient) {
		recipeIngredeint.addNewIngredient(ingredient);
	}

	@DeleteMapping(path = "{ingredientId}")
	public void deleteIngredient(@PathVariable("ingredientId") Long ingredientId) {
		ingredientService.deleteIngredient(ingredientId);
	}

	@PutMapping(path = "{ingredientId}")
	public void updateIngredient(@PathVariable("ingredientId") Long ingredientId,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String description, {
		ingredientService.updateIngredient(ingredientId, ingredientName, description);
	}
}*/
