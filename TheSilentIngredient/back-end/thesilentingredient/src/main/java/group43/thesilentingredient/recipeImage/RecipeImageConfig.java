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
			
			//PREFIXES MEANING :
			// ND - NO DIET 
			// DV - DIET VEGAN 
			// DVG - DIET VEGETARIAN 
			// DH - DIET HALAL 
			// DL - DIET LACTOSE FREE 
			// DG - DIET GLUTEN FREE 
			
			// NO DIET RECIPE IMAGES
			RecipeImage NDWhiteRice1 = new RecipeImage(1,"/images/recipe/nodiet/NDWhiteRice1.png");
			RecipeImage NDWhiteRice2 = new RecipeImage(1,"/images/recipe/nodiet/NDWhiteRice2.png");
			RecipeImage NDWhiteRice3 = new RecipeImage(1,"/images/recipe/nodiet/NDWhiteRice3.png");
			RecipeImage NDWhiteRice4 = new RecipeImage(1,"/images/recipe/nodiet/NDWhiteRice4.png");
			RecipeImage NDWhiteRice5 = new RecipeImage(1,"/images/recipe/nodiet/NDWhiteRice5.png");
			
			
			repository.saveAll(List.of(NDWhiteRice1,NDWhiteRice2,NDWhiteRice3,NDWhiteRice4,NDWhiteRice5));
		};

	}
}
