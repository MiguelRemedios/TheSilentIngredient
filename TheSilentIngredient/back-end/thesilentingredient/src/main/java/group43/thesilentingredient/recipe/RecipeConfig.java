package group43.thesilentingredient.recipe;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecipeConfig {

	@Bean
	CommandLineRunner commandLineRunner(RecipeRepository repository) {
		return args -> {
			
			//PREFIXES MEANING :
			// DE - DIET VEGAN
			// DEG - DIET VEGETARIAN
			// DH - DIET HALAL
			// DL - DIET LACTOSE FREE
			// DG - DIET GLUTEN FREE

			
			
			//HALAL RECIPES
			
			Recipe DHSandwich = new Recipe(
					"Sandwich",
					"Delicious chicken/beef sandwich",
					1,
					"5 mins"
					);
			
			Recipe DHChickenTKM = new Recipe(
					"Chicken Tikka Masala",
					"Amazing Chicken Masala dish",
					2,
					"20 mins"
					);
			
			Recipe DHMeatball = new Recipe(
					"2 in 1 Meatball",
					"Meatballs with flavoured sauce",
					2,
					"15 mins"
					);
			
			Recipe DHChickenFlatbread = new Recipe(
					"Chicken Flatbread",
					"Delicious stuffed Chicken Flatbread",
					1,
					"10 mins"
					);
			
			repository.saveAll(List.of(DHSandwich,
					DHChickenTKM,
					DHMeatball,
					DHChickenFlatbread)
					);
		};

	}
}
