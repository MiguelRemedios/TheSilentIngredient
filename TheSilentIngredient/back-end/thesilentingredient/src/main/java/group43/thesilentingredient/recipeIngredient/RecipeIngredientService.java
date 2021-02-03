package group43.thesilentingredient.recipeIngredient;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RecipeIngredientService {

	private final RecipeIngredientRepository recipeIngredientRepository;
	
	@Autowired
	public RecipeIngredientService(RecipeIngredientRepository recipeIngredientRepository) {
		this.recipeIngredientRepository = recipeIngredientRepository;
	}
	
	public List<RecipeIngredient> getRecipeIngredient() {
		return recipeIngredientRepository.findAll();
	}
	
	public List<RecipeIngredient> retrieveRecipeIngredient(Integer recipe_id) {
		return recipeIngredientRepository.findIngredientsByRecipe_id(recipe_id);
	}

	public void addIngredientToRecipe(RecipeIngredient recipeIngredient) {
		Optional<RecipeIngredient> recipeIngredientOptional = recipeIngredientRepository.repeatIngredient(recipeIngredient.getRecipe_id(), recipeIngredient.getIngredient_id());
		if (recipeIngredientOptional.isPresent()) {
			throw new IllegalStateException("Recipe taken!");
		}

		recipeIngredientRepository.save(recipeIngredient);
		
	}
	//Deletes all ingredients for recipe_id thats passed through
    public void deleteRecipeIngredient(Long recipe_id) {
        boolean exists = recipeIngredientRepository.existsById(recipe_id);
        if(!exists) {
            throw new IllegalStateException("Recipe with ID " + recipe_id + " does not exist!");
        }
        
        recipeIngredientRepository.deleteById(recipe_id);
    }
    @Transactional        
    public void updateRecipeIngredient(Long id, Integer ingredient_id, Integer recipe_id, Double quantity, String measurement) {
        RecipeIngredient recipeIngredient = recipeIngredientRepository.findById(id).orElseThrow(() -> new IllegalStateException("Recipe with ID " + id + " does not exist!"));

        if (ingredient_id != null && ingredient_id > 0 && !Objects.equals(recipeIngredient.getIngredient_id(), ingredient_id)) { //If the name is not the same as the current
            recipeIngredient.setIngredient_id(ingredient_id);
        }

        if (recipe_id != null && recipe_id > 0 && !Objects.equals(recipeIngredient.getRecipe_id(), recipe_id)) { //If the name is not the same as the current
            recipeIngredient.setRecipe_id(recipe_id);
        }
        
        if (quantity != null && quantity > 0 && !Objects.equals(recipeIngredient.getRecipe_id(), quantity)) { //If the name is not the same as the current
            recipeIngredient.setQuantity(quantity);
        }
        
        if (measurement != null && measurement.length() > 0 && !Objects.equals(recipeIngredient.getMeasurement(), measurement)) { //If the name is not the same as the current
        
            recipeIngredient.setMeasurement(measurement);
        }
    }
}
