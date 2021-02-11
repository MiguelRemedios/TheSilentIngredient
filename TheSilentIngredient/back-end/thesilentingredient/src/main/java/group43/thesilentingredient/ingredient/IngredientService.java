package group43.thesilentingredient.ingredient;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
  
@Service
public class IngredientService {

	private final IngredientRepository ingredientRepository;

	@Autowired
	public IngredientService(IngredientRepository ingredientRepository) {
		this.ingredientRepository = ingredientRepository;
	}


	public List<Ingredient> getIngredients() {
		return ingredientRepository.findAll();
	}
	
	public Optional<Ingredient> retrieveIngredient(Long ingredientId) {
		return ingredientRepository.findById(ingredientId);
	}

	public void addNewIngredient(Ingredient ingredient) {
		Optional<Ingredient> ingredientOptional = ingredientRepository.findIngredientByName(ingredient.getName());

		if (ingredientOptional.isPresent()) {
			throw new IllegalStateException("Ingredient taken!");
		}

		ingredientRepository.save(ingredient);
	}


	public void deleteIngredient(Long ingredientId) {

		boolean exists = ingredientRepository.existsById(ingredientId);

		if(!exists) {
			throw new IllegalStateException("Ingredient with ID " + ingredientId + " does not exist!");
		}

		ingredientRepository.deleteById(ingredientId);
	}


	@Transactional
	public void updateIngredient(Long ingredientId, String ingredientName, double ingredientCalories, double ingredientProtein, double ingredientCarbohydrate, double ingredientFat) {
		Ingredient ingredient = ingredientRepository.findById(ingredientId)
				.orElseThrow(() -> new IllegalStateException("Ingredient with ID " + 
						ingredientId + 
						" does not exist!"));

		if (ingredientName != null && 
				ingredientName.length() > 0 &&
				!Objects.equals(ingredient.getName(), ingredientName)) { //If the name is not the same as the current
			
			Optional<Ingredient> ingredientOptional = ingredientRepository.findIngredientByName(ingredientName);
			
			if (ingredientOptional.isPresent()) {
				throw new IllegalStateException("Ingredient taken!");
			}
			ingredient.setName(ingredientName);
		}

		if (ingredientCalories >= 0 &&
				!Objects.equals(ingredient.getCalories(), ingredientCalories)) { //If the name is not the same as the current

			ingredient.setCalories(ingredientCalories);
		}
		if (ingredientProtein >= 0 &&
				!Objects.equals(ingredient.getProtein(), ingredientProtein)) { //If the name is not the same as the current

			ingredient.setProtein(ingredientProtein);
		}
		if (ingredientCarbohydrate >= 0 &&
				!Objects.equals(ingredient.getCarbohydrate(), ingredientCarbohydrate)) { //If the name is not the same as the current

			ingredient.setCarbohydrate(ingredientCarbohydrate);
		}
		if (ingredientFat >= 0 &&
				!Objects.equals(ingredient.getFat(), ingredientFat)) { //If the name is not the same as the current

			ingredient.setFat(ingredientFat);
		}

	
	}

}