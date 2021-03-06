package group43.thesilentingredient.recipe;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	public Optional<Recipe> retrieveRecipe(Long recipeId) {
		return recipeRepository.findById(recipeId);
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


	@Transactional
	public void updateRecipe(Long recipeId, String recipeName, String recipeDesc, Integer serving, String cooktime) {
		Recipe recipe = recipeRepository.findById(recipeId)
				.orElseThrow(() -> new IllegalStateException("Recipe with ID " + 
						recipeId + 
						" does not exist!"));

		if (recipeName != null && 
				recipeName.length() > 0 &&
				!Objects.equals(recipe.getName(), recipeName)) { //If the name is not the same as the current
			
			Optional<Recipe> recipeOptional = recipeRepository.findRecipeByName(recipeName);
			
			if (recipeOptional.isPresent()) {
				throw new IllegalStateException("Recipe taken!");
			}
			recipe.setName(recipeName);
		}

		if (recipeDesc != null &&
				recipeDesc.length() > 0 &&
				!Objects.equals(recipe.getDescription(), recipeDesc)) { //If the name is not the same as the current

			Optional<Recipe> recipeOptional = recipeRepository.findRecipeByDescription(recipeDesc);

			if (recipeOptional.isPresent()) {
				throw new IllegalStateException("Recipe description taken!");
			}
			recipe.setDescription(recipeDesc);
		}

		if (serving != null &&
				serving > 0 &&
				!Objects.equals(recipe.getServing(), serving)) { //If the name is not the same as the current

			recipe.setServing(serving);
		}

		if (cooktime != null &&
				cooktime.length() > 0 &&
				!Objects.equals(recipe.getCooktime(), cooktime)) { //If the name is not the same as the current

			recipe.setCooktime(cooktime);
		}
	}

}