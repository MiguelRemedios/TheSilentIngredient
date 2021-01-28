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
			Recipe chickenmasala = new Recipe(
					"Chicken Masala",
					"Chicken with sauce"
					);
			
			Recipe lasagna = new Recipe(
					"Lasagna",
					"Pasta with meat"
					);
			
			Recipe pizza = new Recipe(
					"Pizza",
					"Bread with sauce"
					);
			
			repository.saveAll(List.of(chickenmasala,
					lasagna,
					pizza)
					);
		};
		
	}
}
