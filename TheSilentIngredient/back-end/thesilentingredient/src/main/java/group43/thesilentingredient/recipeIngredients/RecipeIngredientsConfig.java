package group43.thesilentingredient.recipeIngredients;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecipeIngredientsConfig {

	@Bean
	CommandLineRunner RecipeIngredientsCR(RecipeIngredientsRepository repository) {
		return args -> {
			RecipeIngredients chickenmasala1 = new RecipeIngredients(1,1,8.0,"quantity");
			RecipeIngredients chickenmasala2 = new RecipeIngredients(2,1,400,"g");
			RecipeIngredients chickenmasala3 = new RecipeIngredients(3,1,150,"ml");
		};
	}
}
