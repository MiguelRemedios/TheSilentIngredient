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
			
			Ingredient cucumber = new Ingredient(
					"cucumber",
					1,
					1,
					3,
					2
					);
			
			Ingredient water = new Ingredient(
					"water",
					0,
					0,
					0,
					0
					);
			Ingredient white rice = new Ingredient(
					"white rice",
					68,
					1,
					15,
					0
					);
			
			Ingredient olive oil = new Ingredient(
					"olive oil",
					119,
					0,
					0,
					13
					);
			
			Ingredient ground beef = new Ingredient(
					"ground beef",
					218,
					24,
					0,
					13
					);
			Ingredient spaghetti = new Ingredient(
					"spaghetti",
					174,
					8,
					40,
					1
					);
			Ingredient pasta sauce = new Ingredient(
					"pasta sauce",
					130,
					4,
					20,
					4
					);
			Ingredient onion = new Ingredient(
					"onion",
					40,
					1,
					9,
					0
					);
			Ingredient chicken breast = new Ingredient(
					"chicken breast",
					284,
					53,
					0,
					6
					);
			Ingredient bagel = new Ingredient(
					"bagel",
					289,
					11,
					56,
					2
					);
			Ingredient tomatoes = new Ingredient(
					"tomatoes",
					18,
					1,
					4,
					0
					);
			Ingredient lettuce = new Ingredient(
					"lettuce",
					10,
					1,
					2,
					0
					);
			Ingredient light mayonnaise = new Ingredient(
					"light mayonnaise",
					20,
					0,
					6,
					1
					);
			Ingredient black pepper = new Ingredient(
					"black pepper",
					4,
					0,
					1,
					0
					);
			Ingredient bread crumbs = new Ingredient(
					"bread crumbs",
					450,
					17,
					80,
					6
					);
			Ingredient garlic glove = new Ingredient(
					"garlic glove",
					13,
					0,
					3,
					0
					);
			Ingredient rosemary sprigs = new Ingredient(
					"rosemary sprigs",
					4,
					0,
					0,
					0
					);
			Ingredient leek = new Ingredient(
					"leek",
					54,
					1,
					12,
					0
					);
			Ingredient dry white wine = new Ingredient(
					"dry white wine",
					120,
					0,
					4,
					0
					);
			
			repository.saveAll(List.of(egg,
					milk,
					banana,
					cucumber,
					water,
					white rice,
					olive oil,
					ground beef,
					spaghetti,
					pasta sauce,
					onion,
					chicken breast,
					bagel,
					tomatoes,
					lettuce,
					light mayonnaise,
					black pepper,
					bread crumbs,
					garlic glove,
					rosemary sprigs,
					leek,
					dry white wine,)
					);
		};

	}
}
