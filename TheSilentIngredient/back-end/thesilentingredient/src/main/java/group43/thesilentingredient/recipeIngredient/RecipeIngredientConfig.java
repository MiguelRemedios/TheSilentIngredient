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
			
			//OBJECT NAME'S METHODOLOGY
			//r = recipe
			//{id}
			//ing = ingredient
			//{nr} = ingredient number
			// *** r{id}ing{nr} ***
			
			//RECIPE ID - 1
			RecipeIngredient ing1 = new RecipeIngredient(1,1,8.0,"quantity");
			RecipeIngredient ing2 = new RecipeIngredient(2,1,400.0,"g");
			RecipeIngredient ing3 = new RecipeIngredient(3,1,150.0,"ml");
			RecipeIngredient ing4 = new RecipeIngredient(4,2,8.0,"quantity");
			RecipeIngredient ing5 = new RecipeIngredient(2,2,400.0,"g");
			RecipeIngredient ing6 = new RecipeIngredient(3,2,9000.0,"ml");
			RecipeIngredient ing7 = new RecipeIngredient(3,2,9000.0,"ml");
			RecipeIngredient ing8 = new RecipeIngredient(3,2,9000.0,"ml");
			
			repository.saveAll(List.of(ing1, ing2, ing3, ing4, ing5, ing6, ing7, ing8));
		};
	}
}
