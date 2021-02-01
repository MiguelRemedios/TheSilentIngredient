package group43.thesilentingredient.recipeImage;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecipeImageConfig {

	@Bean
	CommandLineRunner commandLineRunner3(RecipeImageRepository repository) {
		return args -> {
			RecipeImage chickenmasala = new RecipeImage(
					1,
					"/images/pic1.png"
					);
			
			RecipeImage lasagna = new RecipeImage(
					2,
					"/images/pic2.png"
					);
			
			RecipeImage pizza = new RecipeImage(
					3,
					"/images/pic3.png"
					);
			
			repository.saveAll(List.of(chickenmasala,
					lasagna,
					pizza)
					);
		};

	}
}
