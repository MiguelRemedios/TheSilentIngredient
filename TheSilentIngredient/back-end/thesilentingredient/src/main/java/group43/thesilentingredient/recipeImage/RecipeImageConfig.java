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
			
			//RECIPE 19
			RecipeImage DLCT1 = new RecipeImage(19,"http://127.0.0.1:5500/images/recipe/Lactose free/DLCT1.jpg");
			RecipeImage DLCT2 = new RecipeImage(19,"http://127.0.0.1:5500/images/recipe/Lactose free/DLCT2.jpg");
			RecipeImage DLCT3 = new RecipeImage(19,"http://127.0.0.1:5500/images/recipe/Lactose free/DLCT3.jpg");
			RecipeImage DLCT4 = new RecipeImage(19,"http://127.0.0.1:5500/images/recipe/Lactose free/DLCT4.jpg");
			RecipeImage DLCT5 = new RecipeImage(19,"http://127.0.0.1:5500/images/recipe/Lactose free/DLCT5.jpg");
			
			//RECIPE 20
			RecipeImage DGP1 = new RecipeImage(20,"http://127.0.0.1:5500/images/recipe/GF/DGP1.jpg");
			RecipeImage DGP2 = new RecipeImage(20,"http://127.0.0.1:5500/images/recipe/GF/DGP2.jpg");
			RecipeImage DGP3 = new RecipeImage(20,"http://127.0.0.1:5500/images/recipe/GF/DGP3.jpg");
			RecipeImage DGP4 = new RecipeImage(20,"http://127.0.0.1:5500/images/recipe/GF/DGP4.jpg");
			RecipeImage DGP5 = new RecipeImage(20,"http://127.0.0.1:5500/images/recipe/GF/DGP5.jpg");
			
			//RECIPE 21
			RecipeImage DGH1 = new RecipeImage(21,"http://127.0.0.1:5500/images/recipe/GF/DGH1.jpg");
			RecipeImage DGH2 = new RecipeImage(21,"http://127.0.0.1:5500/images/recipe/GF/DGH2.jpg");
			RecipeImage DGH3 = new RecipeImage(21,"http://127.0.0.1:5500/images/recipe/GF/DGH3.jpg");
			RecipeImage DGH4 = new RecipeImage(21,"http://127.0.0.1:5500/images/recipe/GF/DGH4.jpg");
			RecipeImage DGH5 = new RecipeImage(21,"http://127.0.0.1:5500/images/recipe/GF/DGH5.jpg");
			
			//RECIPE 22 Gluten-free bread
			RecipeImage DGGFB1 = new RecipeImage(22,"http://127.0.0.1:5500/images/recipe/GF/GFBread1.jpg");
			RecipeImage DGGFB2 = new RecipeImage(22,"http://127.0.0.1:5500/images/recipe/GF/GFBread2.jpg");
			RecipeImage DGGFB3 = new RecipeImage(22,"http://127.0.0.1:5500/images/recipe/GF/GFBread3.jpg");
			RecipeImage DGGFB4 = new RecipeImage(22,"http://127.0.0.1:5500/images/recipe/GF/GFBread4.jpg");
			RecipeImage DGGFB5 = new RecipeImage(22,"http://127.0.0.1:5500/images/recipe/GF/GFBread5.jpg");
			
			//RECIPE 23 Candied bacon
			RecipeImage NDCB1 = new RecipeImage(23,"http://127.0.0.1:5500/images/recipe/nodiet/NDBacon1.jpg");
			RecipeImage NDCB2 = new RecipeImage(23,"http://127.0.0.1:5500/images/recipe/nodiet/NDBacon2.jpg");
			RecipeImage NDCB3 = new RecipeImage(23,"http://127.0.0.1:5500/images/recipe/nodiet/NDBacon3.jpg");
			RecipeImage NDCB4 = new RecipeImage(23,"http://127.0.0.1:5500/images/recipe/nodiet/NDBacon4.jpg");
			RecipeImage NDCB5 = new RecipeImage(23,"http://127.0.0.1:5500/images/recipe/nodiet/NDBacon5.jpg");
			
			//RECIPE 24 Root beer milkshake
			RecipeImage NDRBM1 = new RecipeImage(24,"http://127.0.0.1:5500/images/recipe/nodiet/NDMilkshake1.jpg");
			RecipeImage NDRBM2 = new RecipeImage(24,"http://127.0.0.1:5500/images/recipe/nodiet/NDMilkshake2.jpg");
			RecipeImage NDRBM3 = new RecipeImage(24,"http://127.0.0.1:5500/images/recipe/nodiet/NDMilkshake3.jpg");
			RecipeImage NDRBM4 = new RecipeImage(24,"http://127.0.0.1:5500/images/recipe/nodiet/NDMilkshake4.jpg");
			RecipeImage NDRBM5 = new RecipeImage(24,"http://127.0.0.1:5500/images/recipe/nodiet/NDMilkshake5.jpg");
			
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
									   DVChocolatebrownie4, DVChocolatebrownie5, DGGFB1, DGGFB2,
									   DGGFB3, DGGFB4, DGGFB5,NDCB1, NDCB2, NDCB3, NDCB4, NDCB5,
									   NDRBM1, NDRBM2, NDRBM3, NDRBM4, NDRBM5, DLCT1, DLCT2, DLCT3, DLCT4, DLCT5,
									   DGP1, DGP2, DGP3, DGP4, DGP5, DGH1, DGH2, DGH3, DGH4, DGH5));
		};

	}
}
