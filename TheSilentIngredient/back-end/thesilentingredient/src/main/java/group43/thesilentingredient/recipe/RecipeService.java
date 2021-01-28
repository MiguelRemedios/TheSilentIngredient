package group43.thesilentingredient.recipe;

import java.util.List;

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
}
