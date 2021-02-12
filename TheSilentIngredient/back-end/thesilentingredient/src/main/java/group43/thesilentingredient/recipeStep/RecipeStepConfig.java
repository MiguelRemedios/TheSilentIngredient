package group43.thesilentingredient.recipeStep;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecipeStepConfig {
	
	@Bean
	CommandLineRunner RecipeStepCR(RecipeStepRepository repository) {
		return args -> {
			//r1
			RecipeStep stp1 = new RecipeStep(1,1,"Bring water with salt to a boil in a 4-quart heavy saucepan with a tight-fitting lid.");
			RecipeStep stp2 = new RecipeStep(2,1,"Add rice and stir once, then reduce heat to low and cook, covered, 20 minutes.");
			RecipeStep stp3 = new RecipeStep(3,1,"Remove pan from heat (do not lift lid) and let stand, covered, 5 minutes.");
			RecipeStep stp4 = new RecipeStep(4,1,"Fluff rice gently with a fork and serve.");
			
			//r2
			RecipeStep stp5 = new RecipeStep(1,2,"Dice onion. Crumble ground beef into frying pan ");
			RecipeStep stp6 = new RecipeStep(2,2,"Add diced onion. Cook until beef is browned through.");
			RecipeStep stp7 = new RecipeStep(3,2,"While beef is cooking boil water for pasta and boil as per package directions.");
			RecipeStep stp8 = new RecipeStep(4,2,"When beef is cooked through add pasta sauce");
			RecipeStep stp9 = new RecipeStep(5,2,"Add any desired herbs & heat until warmed evenly through.");
			RecipeStep stp10 = new RecipeStep(6,2,"Drain pasta and serve meat sauce over pasta. Enjoy!");
			
			//r3
			RecipeStep stp11 = new RecipeStep(1,3,"Slice the bagel in half, and if desired toast lightly.");
			RecipeStep stp12 = new RecipeStep(2,3,"Apply half of the mayonnaise to the cut-side of the top half of the bagel and the rest on the other half.");
			RecipeStep stp13 = new RecipeStep(3,3,"To cook chicken, first pound out chicken breast a bit to the same thickness by carefully.");
			RecipeStep stp14 = new RecipeStep(4,3,"Cook in a nonstick pan over medium heat with a tsp of olive oil for bout 4-5 minutes per side until cooked.");
			RecipeStep stp15 = new RecipeStep(5,3,"Slice the cooked chicken breast into 1/2cm thick slices.");
			RecipeStep stp16 = new RecipeStep(6,3,"Slice the Tomatoes into 1/2cm thick slices.");
			RecipeStep stp17 = new RecipeStep(7,3,"Arrange the lettuce on-top the bottom-half of the bagel.");
			RecipeStep stp18 = new RecipeStep(8,3,"Place the slices of cooked chicken on top of the lettuce.");
			RecipeStep stp19 = new RecipeStep(9,3,"Put the tomatoes on top of the chicken ");
			RecipeStep stp20 = new RecipeStep(10,3,"Finish by covering with the remaining half of the bagel and serve.");
			
			repository.saveAll(List.of(stp1, stp2, stp3, stp4, stp5, stp6, stp7, stp8, stp9,
					stp10, stp11, stp12, stp13, stp14, stp15, stp16, stp17, stp18, stp19, stp20));
			
		};
		
	}
}
