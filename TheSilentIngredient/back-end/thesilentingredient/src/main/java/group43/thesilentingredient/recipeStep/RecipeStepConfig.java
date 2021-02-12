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
			RecipeStep stp1 = new RecipeStep(1,1,"Bring water with salt to a boil in a 4-quart heavy saucepan with a tight-fitting lid.\r\n"
					+ "Add rice and stir once, then reduce heat to low and cook, covered, 20 minutes");
			RecipeStep stp2 = new RecipeStep(2,1,"Remove pan from heat (do not lift lid) and let stand, covered, 5 minutes. Fluff rice gently with a fork.");
			RecipeStep stp3 = new RecipeStep(1,2,"Dice onion. Crumble ground beef into frying pan and add diced onion. Cook until beef is browned through.");
			RecipeStep stp4 = new RecipeStep(2,2,"While beef is cooking boil water for pasta and boil as per package directions.");
			RecipeStep stp5 = new RecipeStep(3,2,"When beef is cooked through add pasta sauce. Add any desired herbs. Heat until warmed evenly through.");
			RecipeStep stp6 = new RecipeStep(4,2,"Drain pasta and serve meat sauce over pasta. Enjoy!");
			/*RecipeStep stp7 = new RecipeStep(1,3,"Slice the bagel in half, and if desired toast lightly.\r\n"
					+ "Apply half of the mayonnaise to the cut-side of the top half of the bagel, \r\n"
					+ "and the remaining half of the mayonnaise to the bottom-half of the bagel.");
			RecipeStep stp8 = new RecipeStep(2,3,"To cook chicken, first pound out chicken breast a bit to the same thickness by carefully \r\n"
					+ "using a kitchen malletor the back of a heavy jar.\r\n"
					+ "Cook in a nonstick pan over medium heat with about a tsp of olive oil, about 4 minutes per side or until cooked \r\n"
					+ "through completely without any pink in the middle.\r\n"
					+ "Slice the cooked chicken breast into 1/2cm thick slices.\r\n"
					+ "Slice the Tomatoes into 1/2cm thick slices.");
			RecipeStep stp9 = new RecipeStep(3,3,"Arrange the lettuce on-top the bottom-half of the bagel, on-top of the lettuce place the slices of \r\n"
					+ "cooked chicken, balance the tomatoes on top of the chicken and finish by covering with the remaining half of the \r\n"
					+ "bagel.");
			RecipeStep stp10 = new RecipeStep(1,4,"Preheat an outdoor grill for high heat and lightly oil grate.");
			RecipeStep stp11 = new RecipeStep(2,4,"In a medium bowl, whisk together egg, salt and pepper. Place"+
			"ground beef and bread crumbs into the mixture.\r\n"
					+ "With hands or a fork, mix until well blended. Form into 4 patties approximately 3/4 inch thick.");
			RecipeStep stp12 = new RecipeStep(3,4,"Place patties on the prepared grill. Cover and cook 6 to 8 minutes per side,"+ 
					"or to desired doneness.");
			RecipeStep stp13 = new RecipeStep(1,5,"Cut the pickling cucumbers in half lengthways, and slice regular ones"+
					" through the middle, then into fingers. Peel and finely slice the shallots.");
			RecipeStep stp14 = new RecipeStep(2,5,"Put the cucumbers and shallots in a colander. Sprinkle over 2 teaspoons"+
					" of sea salt. After 45 minutes, rinse well.");
			RecipeStep stp15 = new RecipeStep(3,5,"Combine all the other ingredients in a pan and bring to the boil."+
					" Stir until the sugar dissolves.");
			RecipeStep stp16 = new RecipeStep(4,5,"Fit the cucumbers snugly into a Kilner jar, then pour over the liquid."+
					" Seal and leave for at least 24 hours.");
			RecipeStep stp17 = new RecipeStep(1,6,"Peel and finely chop the onions, drain and rinse the chickpeas and"+
					" finely slice the green chillies.");
			RecipeStep stp18 = new RecipeStep(2,6,"Heat the oil in a saucepan over a medium heat and add the mustard seeds;"+
					" once they’re crackling, add the asafoetida. Stir in the onions and fry until transparent and turning golden at the edges.");
			RecipeStep stp19 = new RecipeStep(3,6,"Chop and add the tinned tomatoes, then cook for another 5 minutes, before adding the ginger,"+
					" garlic and green chilli pastes, the red chilli powder, dhana jeera, sugar (if using), and a pinch of sea salt."+
					" Keep stirring and cook for further 5 minutes.");
			RecipeStep stp20 = new RecipeStep(4,6,"Stir the chickpeas into the pan. Add 250ml water to make a thick sauce."+
					" Place the lid on the pan, lower the heat and simmer for 5 to 7 minutes.");
			RecipeStep stp21 = new RecipeStep(5,6,"Pick and finely chop the coriander, then"+
					" sprinkle on top along with the garam masala and finely sliced green chillies, to serve.");*/
			repository.saveAll(List.of(stp1, stp2, stp3, stp4, stp5, stp6/*, stp7, stp8, stp9,
					stp10, stp11, stp12, stp13, stp14, stp15, stp16, stp17, stp18, stp19, stp20, stp21*/));
		};
		
	}
}
