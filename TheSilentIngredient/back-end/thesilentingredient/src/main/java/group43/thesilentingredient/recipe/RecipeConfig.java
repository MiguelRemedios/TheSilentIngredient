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
			// ND - NO DIET 
			// DV - DIET VEGAN 
			// DVG - DIET VEGETARIAN 
			// DH - DIET HALAL 
			// DL - DIET LACTOSE FREE 
			// DG - DIET GLUTEN FREE 
		
			//NO DIET (GENERAL) RECIPES
			Recipe NDWhiteRice = new Recipe(
					"White Rice",
					"Outstanding white rice",
					6,
					"25 mins"
					);
			
			Recipe NDSpaghetti = new Recipe(
					"Spaghetti with Meat sauce",
					"Delicious spaghetti involved in meat sauce",
					6,
					"20 mins"
					);
			
			Recipe NDChickenBagel = new Recipe(
					"Chicken and Mayo Bagel",
					"Amazing saucy chicken bagel",
					1,
					"15 mins"
					);
			
			Recipe NDBurger = new Recipe(
					"Burger",
					"Excellent and well prepared burgerl",
					4,
					"15 mins"
					);
			
			//VEGAN RECIPES
			Recipe DVSpicyPickle = new Recipe(
					"Spicy Cucumber Pickles",
					"Special spicy flavoured cucumber pickles",
					2,
					"15 mins"
					);
			
			Recipe DVChickpeaCurry = new Recipe(
					"Chickpea Curry",
					"Delicious chickpea vegan curry",
					4,
					"40 mins"
					);
			
			Recipe DVChocolateBrownies = new Recipe(
					"Chocolate Brownies",
					"Simple and tasty vegan chocolate brownies",
					1,
					"5 mins"
					);
			
			//VEGETARIAN RECIPES
			Recipe DVGFajitaRoll = new Recipe(
					"Fajita Roll",
					"Simple and tasty fajita roll",
					2,
					"15 mins"
					);

			Recipe DVGSpicyRice = new Recipe(
					"Spicy Mexican Rice",
					"Delicious and easy spicy rice dish",
					6,
					"10 mins"
					);
			
			Recipe DVGPasta = new Recipe(
					"Pasta Salad with Bocconcini, Capers and Tomatoes",
					"Outstanding pasta reached in delicious vegetables",
					2,
					"20 mins"
					);
			
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
			
			//LACTOSE FREE RECIPES
			Recipe DLPasta = new Recipe(
					"Leek and Mushroom Pasta",
					"Tempting leek and mushroom pasta",
					4,
					"20 mins"
					);
			
			Recipe DLShakshuka = new Recipe(
					"Shakshuka",
					"Mouthwatering shakshuka dish",
					8,
					"30 mins"
					);
			
			Recipe DLCassoulet = new Recipe(
					"French Cassoulet",
					"Delicious french cassoulet",
					5,
					"25 mins"
					);
			
			Recipe DLBananaPancakes = new Recipe(
					"Banana Pacakes",
					"Amazing banana pancakes",
					6,
					"35 mins"
					);
			
			Recipe DLChickpeaTagine = new Recipe(
					"Moroccan Chickpea Tagine",
					"Rich and tasty chickpea tagine dish",
					4,
					"45 mins"
					);
			
			//GLUTEN FREE RECIPES
			Recipe DGPancakes = new Recipe(
					"Pancakes",
					"Delicious pancakes",
					6,
					"30 mins"
					);
			
			Recipe DGHummus = new Recipe(
					"Hummus",
					"Wonderful and amazing hummus",
					6,
					"15 mins"
					);
			
			Recipe DGBread = new Recipe(
					"Bread",
					"Gluten free bread",
					10,
					"1 hr 10 mins"
					);
			
			repository.saveAll(List.of(DHSandwich, DHChickenTKM, DHMeatball, DHChickenFlatbread, //DH
									   	DGPancakes, DGHummus, DGBread, //DG
									   	DVSpicyPickle, DVChickpeaCurry, DVChocolateBrownies, //DV
									   	NDWhiteRice, NDSpaghetti, NDChickenBagel, NDBurger, //DN
									   	DLPasta, DLShakshuka, DLCassoulet, DLBananaPancakes, DLChickpeaTagine, //DL
									   	DVGFajitaRoll, DVGSpicyRice, DVGPasta )); //DVG
		};

	}
}
