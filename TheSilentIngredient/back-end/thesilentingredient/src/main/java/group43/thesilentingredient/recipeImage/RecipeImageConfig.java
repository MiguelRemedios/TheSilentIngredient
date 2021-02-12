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
			//RECIPE 1
			RecipeImage NDWhiteRice1 = new RecipeImage(1,"/images/recipe/nodiet/NDWhiteRice1.jpg");
			RecipeImage NDWhiteRice2 = new RecipeImage(1,"/images/recipe/nodiet/NDWhiteRice2.jpg");
			RecipeImage NDWhiteRice3 = new RecipeImage(1,"/images/recipe/nodiet/NDWhiteRice3.jpg");
			RecipeImage NDWhiteRice4 = new RecipeImage(1,"/images/recipe/nodiet/NDWhiteRice4.jpg");
			RecipeImage NDWhiteRice5 = new RecipeImage(1,"/images/recipe/nodiet/NDWhiteRice5.jpg ");
			//RECIPE 2
			RecipeImage NDSpaghetti1 = new RecipeImage(2,"/images/recipe/nodiet/NDSpaghetti1.jpg");
			RecipeImage NDSpaghetti2 = new RecipeImage(2,"/images/recipe/nodiet/NDSpaghetti2.jpg");
			RecipeImage NDSpaghetti3 = new RecipeImage(2,"/images/recipe/nodiet/NDSpaghetti3.jpg");
			RecipeImage NDSpaghetti4 = new RecipeImage(2,"/images/recipe/nodiet/NDSpaghetti4.jpg");
			RecipeImage NDSpaghetti5 = new RecipeImage(2,"/images/recipe/nodiet/NDSpaghetti5.jpg");
			
			repository.saveAll(List.of(NDWhiteRice1,NDWhiteRice2,NDWhiteRice3,NDWhiteRice4,NDWhiteRice5,
									   NDSpaghetti1,NDSpaghetti2,NDSpaghetti3,NDSpaghetti4,NDSpaghetti5));
		};

	}
}
