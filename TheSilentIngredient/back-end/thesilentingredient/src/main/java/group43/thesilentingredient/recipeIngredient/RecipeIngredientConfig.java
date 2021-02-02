package group43.thesilentingredient.recipeIngredient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RecipeIngredientConfig {

	@Bean
	CommandLineRunner RecipeIngredientsCR(RecipeIngredientRepository repository) {
		return args -> {
			RecipeIngredient chickenmasala1 = new RecipeIngredient(1,1,8.0,"quantity");
			RecipeIngredient chickenmasala2 = new RecipeIngredient(2,1,400,"g");
			RecipeIngredient chickenmasala3 = new RecipeIngredient(3,1,150,"ml");
			
			RecipeIngredient ing1 = new RecipeIngredient(4,2,8.0,"quantity");
			RecipeIngredient ing2 = new RecipeIngredient(2,2,400,"g");
			RecipeIngredient ing3 = new RecipeIngredient(3,2,150,"ml");
			
			repository.saveAll(List.of(chickenmasala1, chickenmasala2, chickenmasala3, ing1, ing2, ing3));
		};
	}
}
