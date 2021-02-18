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
			//RECIPE 8
			RecipeImage fajita1 = new RecipeImage(8,"http://127.0.0.1:5500/images/recipe/fajita1.jpg");
			RecipeImage fajita2 = new RecipeImage(8,"http://127.0.0.1:5500/images/recipe/fajita2.jpg");
			RecipeImage fajita3 = new RecipeImage(8,"http://127.0.0.1:5500/images/recipe/fajita3.jpg");
			RecipeImage fajita4 = new RecipeImage(8,"http://127.0.0.1:5500/images/recipe/fajita4.jpg");
			RecipeImage fajita5 = new RecipeImage(8,"http://127.0.0.1:5500/images/recipe/fajita5.jpg");
			//RECIPE 8
			RecipeImage spicyrice1 = new RecipeImage(9,"http://127.0.0.1:5500/images/recipe/spicyrice1.jpg");
			RecipeImage spicyrice2 = new RecipeImage(9,"http://127.0.0.1:5500/images/recipe/spicyrice2.jpg");
			RecipeImage spicyrice3 = new RecipeImage(9,"http://127.0.0.1:5500/images/recipe/spicyrice3.jpg");
			RecipeImage spicyrice4 = new RecipeImage(9,"http://127.0.0.1:5500/images/recipe/spicyrice4.jpg");
			RecipeImage spicyrice5 = new RecipeImage(9,"http://127.0.0.1:5500/images/recipe/spicyrice5.jpg");
			//RECIPE 11
			RecipeImage HALALChicken1 = new RecipeImage(11,"http://127.0.0.1:5500/images/recipe/halal/HALALChicken1.jpg");
			RecipeImage HALALChicken2 = new RecipeImage(11,"http://127.0.0.1:5500/images/recipe/halal/HALALChicken2.jpg");
			RecipeImage HALALChicken3 = new RecipeImage(11,"http://127.0.0.1:5500/images/recipe/halal/HALALChicken3.jpg");
			RecipeImage HALALChicken4 = new RecipeImage(11,"http://127.0.0.1:5500/images/recipe/halal/HALALChicken4.jpg");
			RecipeImage HALALChicken5 = new RecipeImage(11,"http://127.0.0.1:5500/images/recipe/halal/HALALChicken5.jpg");
			//RECIPE 12
			RecipeImage HALALCTM1 = new RecipeImage(12,"http://127.0.0.1:5500/images/recipe/halal/HALALCTM1.jpg");
			RecipeImage HALALCTM2 = new RecipeImage(12,"http://127.0.0.1:5500/images/recipe/halal/HALALCTM2.jpg");
			RecipeImage HALALCTM3 = new RecipeImage(12,"http://127.0.0.1:5500/images/recipe/halal/HALALCTM3.jpg");
			RecipeImage HALALCTM4 = new RecipeImage(12,"http://127.0.0.1:5500/images/recipe/halal/HALALCTM4.jpg");
			RecipeImage HALALCTM5 = new RecipeImage(12,"http://127.0.0.1:5500/images/recipe/halal/HALALCTM5.jpg");
			//RECIPE 13
			RecipeImage HALALMB1 = new RecipeImage(13,"http://127.0.0.1:5500/images/recipe/halal/HALALMB1.jpg");
			RecipeImage HALALMB2 = new RecipeImage(13,"http://127.0.0.1:5500/images/recipe/halal/HALALMB2.jpg");
			RecipeImage HALALMB3 = new RecipeImage(13,"http://127.0.0.1:5500/images/recipe/halal/HALALMB3.jpg");
			RecipeImage HALALMB4 = new RecipeImage(13,"http://127.0.0.1:5500/images/recipe/halal/HALALMB4.jpg");
			RecipeImage HALALMB5 = new RecipeImage(13,"http://127.0.0.1:5500/images/recipe/halal/HALALMB5.jpg");
			
			repository.saveAll(List.of(NDWhiteRice1,NDWhiteRice2,NDWhiteRice3,NDWhiteRice4,NDWhiteRice5,
									   NDSpaghetti1,NDSpaghetti2,NDSpaghetti3,NDSpaghetti4,NDSpaghetti5,
									   NDBagel1,NDBagel2,NDBagel3,NDBagel4,NDBagel5,
									   NDBurger1,NDBurger2,NDBurger3,NDBurger4,NDBurger5,
									   fajita1, fajita2, fajita3, fajita4, fajita5,
									   spicyrice1, spicyrice2, spicyrice3, spicyrice4, spicyrice5,
									   HALALChicken1, HALALChicken2, HALALChicken3, HALALChicken4, HALALChicken5,
									   HALALCTM1, HALALCTM2, HALALCTM3, HALALCTM4, HALALCTM5,
									   HALALMB1, HALALMB2, HALALMB3, HALALMB4, HALALMB5));
		};

	}
}
