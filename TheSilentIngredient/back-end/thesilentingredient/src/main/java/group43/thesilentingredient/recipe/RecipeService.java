package group43.thesilentingredient.recipe;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

	private final RecipeRepository recipeRepository;

	@Autowired
	public RecipeService(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}


	public List<Recipe> getRecipes() {
		return recipeRepository.findAll();
	}


	public void addNewRecipe(Recipe recipe) {
		Optional<Recipe> recipeOptional = recipeRepository.findRecipeByName(recipe.getName());

		if (recipeOptional.isPresent()) {
			throw new IllegalStateException("Recipe taken!");
		}

		recipeRepository.save(recipe);
	}


	public void deleteRecipe(Long recipeId) {

		boolean exists = recipeRepository.existsById(recipeId);

		if(!exists) {
			throw new IllegalStateException("Recipe with ID " + recipeId + " does not exist!");
		}

		recipeRepository.deleteById(recipeId);
	}
}
