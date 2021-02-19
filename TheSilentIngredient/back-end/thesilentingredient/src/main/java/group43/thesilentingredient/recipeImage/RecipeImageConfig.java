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
			RecipeImage NDWhiteRice1 = new RecipeImage(1,"http://127.0.0.1:5500/images/recipe/nodiet/NDWhiteRice1.jpg");
			RecipeImage NDWhiteRice2 = new RecipeImage(1,"http://127.0.0.1:5500/images/recipe/nodiet/NDWhiteRice2.jpg");
			RecipeImage NDWhiteRice3 = new RecipeImage(1,"http://127.0.0.1:5500/images/recipe/nodiet/NDWhiteRice3.jpg");
			RecipeImage NDWhiteRice4 = new RecipeImage(1,"http://127.0.0.1:5500/images/recipe/nodiet/NDWhiteRice4.jpg");
			RecipeImage NDWhiteRice5 = new RecipeImage(1,"http://127.0.0.1:5500/images/recipe/nodiet/NDWhiteRice5.jpg");
			//RECIPE 2
			RecipeImage NDSpaghetti1 = new RecipeImage(2,"http://127.0.0.1:5500/images/recipe/nodiet/NDSpaghetti1.jpg");
			RecipeImage NDSpaghetti2 = new RecipeImage(2,"http://127.0.0.1:5500/images/recipe/nodiet/NDSpaghetti2.jpg");
			RecipeImage NDSpaghetti3 = new RecipeImage(2,"http://127.0.0.1:5500/images/recipe/nodiet/NDSpaghetti3.jpg");
			RecipeImage NDSpaghetti4 = new RecipeImage(2,"http://127.0.0.1:5500/images/recipe/nodiet/NDSpaghetti4.jpg");
			RecipeImage NDSpaghetti5 = new RecipeImage(2,"http://127.0.0.1:5500/images/recipe/nodiet/NDSpaghetti5.jpg");
			//RECIPE 3
			RecipeImage NDBagel1 = new RecipeImage(3,"http://127.0.0.1:5500/images/recipe/nodiet/NDBagel1.jpg");
			RecipeImage NDBagel2 = new RecipeImage(3,"http://127.0.0.1:5500/images/recipe/nodiet/NDBagel2.jpg");
			RecipeImage NDBagel3 = new RecipeImage(3,"http://127.0.0.1:5500/images/recipe/nodiet/NDBagel3.jpg");
			RecipeImage NDBagel4 = new RecipeImage(3,"http://127.0.0.1:5500/images/recipe/nodiet/NDBagel4.jpg");
			RecipeImage NDBagel5 = new RecipeImage(3,"http://127.0.0.1:5500/images/recipe/nodiet/NDBagel5.jpg");
			//RECIPE 4
			RecipeImage NDBurger1 = new RecipeImage(4,"http://127.0.0.1:5500/images/recipe/nodiet/NDBurger1.jpg");
			RecipeImage NDBurger2 = new RecipeImage(4,"http://127.0.0.1:5500/images/recipe/nodiet/NDBurger2.jpg");
			RecipeImage NDBurger3 = new RecipeImage(4,"http://127.0.0.1:5500/images/recipe/nodiet/NDBurger3.jpg");
			RecipeImage NDBurger4 = new RecipeImage(4,"http://127.0.0.1:5500/images/recipe/nodiet/NDBurger4.jpg");
			RecipeImage NDBurger5 = new RecipeImage(4,"http://127.0.0.1:5500/images/recipe/nodiet/NDBurger5.jpg");
			//RECIPE 5
			RecipeImage DVSpicycucumberpickle1 = new RecipeImage(5,"http://127.0.0.1:5500/images/recipe/Vegan/DVSpicycucumber1.jpg");
			RecipeImage DVSpicycucumberpickle2 = new RecipeImage(5,"http://127.0.0.1:5500/images/recipe/Vegan/DVSpicycucumber2.jpg");
			RecipeImage DVSpicycucumberpickle3 = new RecipeImage(5,"http://127.0.0.1:5500/images/recipe/Vegan/DVSpicycucumber3.jpg");
			RecipeImage DVSpicycucumberpickle4 = new RecipeImage(5,"http://127.0.0.1:5500/images/recipe/Vegan/DVSpicycucumber4.jpg");
			RecipeImage DVSpicycucumberpickle5 = new RecipeImage(5,"http://127.0.0.1:5500/images/recipe/Vegan/DVSpicycucumber5.jpg");
			//RECIPE 6
			RecipeImage DVChickpeacurry1 = new RecipeImage(6,"http://127.0.0.1:5500/images/recipe/Vegan/DVChickpeacurry1.jpg");
			RecipeImage DVChickpeacurry2 = new RecipeImage(6,"http://127.0.0.1:5500/images/recipe/Vegan/DVChickpeacurry2.jpg");
			RecipeImage DVChickpeacurry3 = new RecipeImage(6,"http://127.0.0.1:5500/images/recipe/Vegan/DVChickpeacurry3.jpg");
			RecipeImage DVChickpeacurry4 = new RecipeImage(6,"http://127.0.0.1:5500/images/recipe/Vegan/DVChickpeacurry4.jpg");
			RecipeImage DVChickpeacurry5 = new RecipeImage(6,"http://127.0.0.1:5500/images/recipe/Vegan/DVChickpeacurry5.jpg");
			//RECIPE 7
			RecipeImage DVChocolatebrownie1 = new RecipeImage(7,"http://127.0.0.1:5500/images/recipe/Vegan/DVChocolatebrownie1.jpg");
			RecipeImage DVChocolatebrownie2 = new RecipeImage(7,"http://127.0.0.1:5500/images/recipe/Vegan/DVChocolatebrownie2.jpg");
			RecipeImage DVChocolatebrownie3 = new RecipeImage(7,"http://127.0.0.1:5500/images/recipe/Vegan/DVChocolatebrownie3.jpg");
			RecipeImage DVChocolatebrownie4 = new RecipeImage(7,"http://127.0.0.1:5500/images/recipe/Vegan/DVChocolatebrownie4.jpg");
			RecipeImage DVChocolatebrownie5 = new RecipeImage(7,"http://127.0.0.1:5500/images/recipe/Vegan/DVChocolatebrownie5.jpg");
			//RECIPE 8
			RecipeImage fajita1 = new RecipeImage(8,"http://127.0.0.1:5500/images/recipe/fajita1.jpg");
			RecipeImage fajita2 = new RecipeImage(8,"http://127.0.0.1:5500/images/recipe/fajita2.jpg");
			RecipeImage fajita3 = new RecipeImage(8,"http://127.0.0.1:5500/images/recipe/fajita3.jpg");
			RecipeImage fajita4 = new RecipeImage(8,"http://127.0.0.1:5500/images/recipe/fajita4.jpg");
			RecipeImage fajita5 = new RecipeImage(8,"http://127.0.0.1:5500/images/recipe/fajita5.jpg");
			//RECIPE 9
			RecipeImage spicyrice1 = new RecipeImage(9,"http://127.0.0.1:5500/images/recipe/spicyrice1.jpg");
			RecipeImage spicyrice2 = new RecipeImage(9,"http://127.0.0.1:5500/images/recipe/spicyrice2.jpg");
			RecipeImage spicyrice3 = new RecipeImage(9,"http://127.0.0.1:5500/images/recipe/spicyrice3.jpg");
			RecipeImage spicyrice4 = new RecipeImage(9,"http://127.0.0.1:5500/images/recipe/spicyrice4.jpg");
			RecipeImage spicyrice5 = new RecipeImage(9,"http://127.0.0.1:5500/images/recipe/spicyrice5.jpg");
			//RECIPE 10
			RecipeImage pastaSalad1 = new RecipeImage(10,"http://127.0.0.1:5500/images/recipe/halal/pastaSalad1.jpg");
			RecipeImage pastaSalad2 = new RecipeImage(10,"http://127.0.0.1:5500/images/recipe/halal/pastaSalad2.jpg");
			RecipeImage pastaSalad3 = new RecipeImage(10,"http://127.0.0.1:5500/images/recipe/halal/pastaSalad3.jpg");
			RecipeImage pastaSalad4 = new RecipeImage(10,"http://127.0.0.1:5500/images/recipe/halal/pastaSalad4.jpg");
			RecipeImage pastaSalad5 = new RecipeImage(10,"http://127.0.0.1:5500/images/recipe/halal/pastaSalad5.jpg");

			//RECIPE 13
			RecipeImage NDMB1 = new RecipeImage(13,"http://127.0.0.1:5500/images/recipe/nodiet/NDMB1.jpg");
			RecipeImage NDMB2 = new RecipeImage(13,"http://127.0.0.1:5500/images/recipe/nodiet/NDMB2.jpg");
			RecipeImage NDMB3 = new RecipeImage(13,"http://127.0.0.1:5500/images/recipe/nodiet/NDMB3.jpg");
			RecipeImage NDMB4 = new RecipeImage(13,"http://127.0.0.1:5500/images/recipe/nodiet/NDMB4.jpg");
			RecipeImage NDMB5 = new RecipeImage(13,"http://127.0.0.1:5500/images/recipe/nodiet/NDMB5.jpg");
			
			//RECIPE 14
			RecipeImage NDFB1 = new RecipeImage(14,"http://127.0.0.1:5500/images/recipe/nodiet/NDFB1.jpg");
			RecipeImage NDFB2 = new RecipeImage(14,"http://127.0.0.1:5500/images/recipe/nodiet/NDFB2.jpg");
			RecipeImage NDFB3 = new RecipeImage(14,"http://127.0.0.1:5500/images/recipe/nodiet/NDFB3.jpg");
			RecipeImage NDFB4 = new RecipeImage(14,"http://127.0.0.1:5500/images/recipe/nodiet/NDFB4.jpg");
			RecipeImage NDFB5 = new RecipeImage(14,"http://127.0.0.1:5500/images/recipe/nodiet/NDFB5.jpg");
			
			//RECIPE 15
			RecipeImage LFP1 = new RecipeImage(15,"http://127.0.0.1:5500/images/recipe/Lactose free/LFP1.jpg");
			RecipeImage LFP2 = new RecipeImage(15,"http://127.0.0.1:5500/images/recipe/Lactose free/LFP2.jpg");
			RecipeImage LFP3 = new RecipeImage(15,"http://127.0.0.1:5500/images/recipe/Lactose free/LFP3.jpg");
			RecipeImage LFP4 = new RecipeImage(15,"http://127.0.0.1:5500/images/recipe/Lactose free/LFP4.jpg");
			RecipeImage LFP5 = new RecipeImage(15,"http://127.0.0.1:5500/images/recipe/Lactose free/LFP5.jpg");
			
			repository.saveAll(List.of(NDWhiteRice1,NDWhiteRice2,NDWhiteRice3,NDWhiteRice4,NDWhiteRice5,
									   NDSpaghetti1,NDSpaghetti2,NDSpaghetti3,NDSpaghetti4,NDSpaghetti5,
									   NDBagel1,NDBagel2,NDBagel3,NDBagel4,NDBagel5,
									   NDBurger1,NDBurger2,NDBurger3,NDBurger4,NDBurger5,
									   fajita1, fajita2, fajita3, fajita4, fajita5,
									   spicyrice1, spicyrice2, spicyrice3, spicyrice4, spicyrice5,
									   pastaSalad1, pastaSalad2, pastaSalad3, pastaSalad4, pastaSalad5,
									   NDMB1, NDMB2, NDMB3, NDMB4, NDMB5, 
									   NDFB1, NDFB2, NDFB3, NDFB4, NDFB5, 
									   LFP1, LFP2, LFP3, LFP4, LFP5,
									   DVChickpeacurry1, DVChickpeacurry2, DVChickpeacurry3, 
									   DVChickpeacurry4, DVChickpeacurry5, DVSpicycucumberpickle1, DVSpicycucumberpickle2, DVSpicycucumberpickle3,
									   DVSpicycucumberpickle4, DVSpicycucumberpickle5, DVChocolatebrownie1, DVChocolatebrownie2, DVChocolatebrownie3,
									   DVChocolatebrownie4, DVChocolatebrownie5));
		};

	}
}
