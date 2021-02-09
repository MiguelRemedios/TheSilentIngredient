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
			RecipeStep stp1 = new RecipeStep(1,1,"do this");
			RecipeStep stp2 = new RecipeStep(2,1,"do that");
			RecipeStep stp3 = new RecipeStep(3,1,"mix");
			RecipeStep stp4 = new RecipeStep(1,2,"cook");
			RecipeStep stp5 = new RecipeStep(2,2,"fry");
			RecipeStep stp6 = new RecipeStep(3,2,"stir");
			RecipeStep stp7 = new RecipeStep(4,2,"serve");
			repository.saveAll(List.of(stp1, stp2, stp3, stp4, stp5, stp6, stp7));
		};
		
	}
}
