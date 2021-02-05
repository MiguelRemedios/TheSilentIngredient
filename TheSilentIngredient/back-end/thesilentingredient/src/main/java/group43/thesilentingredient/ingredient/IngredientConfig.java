package group43.thesilentingredient.ingredient;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IngredientConfig {    

	@Bean
	CommandLineRunner commandLineRunner10(IngredientRepository repository) {
		return args -> {
			Ingredient egg = new Ingredient(
					"egg",
					8,
					5,
					7,
					11
					);
			
			Ingredient milk = new Ingredient(
					"milk",
					4,
					7,
					2,
					9
					);
			
			Ingredient banana = new Ingredient(
					"banana",
					3,
					2,
					1,
					1
					);
			Ingredient cucumber = new Ingredient(
					"cucumber",
					1,
					1,
					3,
					2
					);
			
			repository.saveAll(List.of(egg,
					milk,
					banana,
					cucumber)
					);
		};

	}
}
