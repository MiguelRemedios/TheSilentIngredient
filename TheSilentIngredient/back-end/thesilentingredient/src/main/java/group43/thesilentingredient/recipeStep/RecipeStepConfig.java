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
			//Recipe-1
			RecipeStep stp1 = new RecipeStep(1,1,"Bring water with salt to a boil in a 4-quart heavy saucepan with a tight-fitting lid.");
			RecipeStep stp2 = new RecipeStep(2,1,"Add rice and stir once, then reduce heat to low and cook, covered, 20 minutes.");
			RecipeStep stp3 = new RecipeStep(3,1,"Remove pan from heat (do not lift lid) and let stand, covered, 5 minutes.");
			RecipeStep stp4 = new RecipeStep(4,1,"Fluff rice gently with a fork and serve.");
			
			//Recipe-2
			RecipeStep stp5 = new RecipeStep(1,2,"Dice onion. Crumble ground beef into frying pan ");
			RecipeStep stp6 = new RecipeStep(2,2,"Add diced onion. Cook until beef is browned through.");
			RecipeStep stp7 = new RecipeStep(3,2,"While beef is cooking boil water for pasta and boil as per package directions.");
			RecipeStep stp8 = new RecipeStep(4,2,"When beef is cooked through add pasta sauce");
			RecipeStep stp9 = new RecipeStep(5,2,"Add any desired herbs & heat until warmed evenly through.");
			RecipeStep stp10 = new RecipeStep(6,2,"Drain pasta and serve meat sauce over pasta. Enjoy!");
			
			//Recipe-3
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
			
			//Recipe-4
			RecipeStep stp21 = new RecipeStep(1,4,"Preheat an outdoor grill for high heat and lightly oil grate.");
			RecipeStep stp22 = new RecipeStep(1,4,"In a medium bowl, whisk together egg, salt and pepper to create a mixture.");
			RecipeStep stp23 = new RecipeStep(1,4,"Place ground beef and bread crumbs into the mixture mix until well blended.");
			RecipeStep stp24 = new RecipeStep(1,4,"Form into 4 patties according to thickness you like.");
			RecipeStep stp25 = new RecipeStep(1,4,"Place patties on the prepared grill. Cover and cook 6 to 8 minutes per side, or to desired level.");
			RecipeStep stp26 = new RecipeStep(1,4,"Serve patty can be eaten with left over buns/bread at home.");
			
			//Recipe-5
			RecipeStep stp27 = new RecipeStep(1,5,"Cut the pickling cucumbers in half lengthways");
			RecipeStep stp28 = new RecipeStep(2,5,"Slice regular ones through the middle, then into fingers");
			RecipeStep stp29 = new RecipeStep(3,5,"Peel and finely slice the shallots.");
			RecipeStep stp30 = new RecipeStep(4,5,"Put the cucumbers and shallots in a colander, Sprinkle over 2 teaspoons of sea salt and let it settle.");
			RecipeStep stp31 = new RecipeStep(5,5,"After 45 minutes of settling, rinse well.");
			RecipeStep stp32 = new RecipeStep(6,5,"Combine all the other ingredients in a pan and bring to the boil. Stir until the sugar dissolves.");
			RecipeStep stp33 = new RecipeStep(7,5,"Fit the cucumbers snugly into a Kilner jar, then pour over the liquid.");
			RecipeStep stp34 = new RecipeStep(8,5,"Seal and let it settle for 24 hours, then you can enjoy it");
			//Recipe-6
			RecipeStep stp35 = new RecipeStep(1,6,"Peel and finely chop the onions");
			RecipeStep stp36 = new RecipeStep(2,6,"drain and rinse the tin chickpea");
			RecipeStep stp37 = new RecipeStep(3,6,"finely slice the green chillies.0");
			RecipeStep stp38 = new RecipeStep(4,6,"Heat the oil in a saucepan over a medium heat and add the mustard seeds");
			RecipeStep stp39 = new RecipeStep(5,6,"Once the seeds are crackling, add the asafoetida.");
			RecipeStep stp40 = new RecipeStep(6,6,"Then stir in the onions and fry until transparent and turning golden at the edges.");
			RecipeStep stp41 = new RecipeStep(7,6,"Chop and add the tinned tomatoes");
			RecipeStep stp42 = new RecipeStep(8,6,"Cook for another 5 minutes");
			RecipeStep stp43 = new RecipeStep(9,6,"Add your spices: ginger, garlic, green chilli pastes, red chilli powder, dhana jeera and a pinch of sea salt.");
			RecipeStep stp44 = new RecipeStep(10,6,"Add sugar if you would like to");
			RecipeStep stp45 = new RecipeStep(11,6,"Keep stirring and cook for another 5 minutes.");
			RecipeStep stp46 = new RecipeStep(12,6,"Stir the chickpeas into the pan.");
			RecipeStep stp47 = new RecipeStep(13,6,"Add 250ml water to make a thick sauce. Place the lid on the pan, lower the heat and simmer for 5 to 7 minutes.");
			RecipeStep stp48 = new RecipeStep(14,6,"Pick and finely chop the coriander");
			RecipeStep stp49 = new RecipeStep(15,6,"Then sprinkle onto the saucepan the coriander along with the garam masala and sliced green chillies, to serve.");
			//Recipe-7
			RecipeStep stp50 = new RecipeStep(1,7,"Place the packet of coconut cream in the fridge and leave for 3-4 hours to thicken up.");
			RecipeStep stp51 = new RecipeStep(2,7,"Preheat the oven to 180°C/350°F/gas 4.");
			RecipeStep stp52 = new RecipeStep(3,7,"Lightly grease a 23cm square brownie tin with sunflower oil and line with baking paper.");
			RecipeStep stp53 = new RecipeStep(4,7,"In a bowl, combine the ground flaxseed with 9 tablespoons of water, stir well and leave to one side to thicken up.");
			RecipeStep stp54 = new RecipeStep(5,7,"Drain and rinse the aduki beans, then put in a food processor and blitz to a smooth paste.");
			RecipeStep stp55 = new RecipeStep(6,7,"Add the flaxseed mixture, sunflower oil, sugar, cocoa, ground almonds, baking powder and vanilla extract into the food processor");
			RecipeStep stp56 = new RecipeStep(7,7,"Then pulse everything again until you have a rich and glossy batter.");
			RecipeStep stp57 = new RecipeStep(8,7,"Roughly chop the dark chocolate into small chunks, add to the mixture and pulse briefly just to incorporate the chocolate.");
			RecipeStep stp58 = new RecipeStep(9,7,"Spoon the batter into the prepared brownie tin and bake for 60 minutes, keep an eye incase you notice any burn then remove it earlier.");
			RecipeStep stp59 = new RecipeStep(10,7,"Set aside tin to cool.");
			RecipeStep stp60 = new RecipeStep(11,7,"In a bowl, whisk the chilled coconut cream, icing sugar and vanilla extract until thick and creamy.");
			RecipeStep stp61 = new RecipeStep(12,7,"Slice the brownie into squares and serve with the coconut whip for drizzling.");
			//Recipe-8
			RecipeStep stp62 = new RecipeStep(1,8,"To make the fajita mix, take two or three strips from each colour of pepper and finely chop them. Set aside.");
			RecipeStep stp63 = new RecipeStep(2,8,"Heat the oil in a frying pan");
			RecipeStep stp64 = new RecipeStep(3,8,"Fry the remaining pepper strips and the onion until soft and starting to brown at the edges.");
			RecipeStep stp65 = new RecipeStep(4,8,"Cool slightly and mix in the chopped raw peppers.");
			RecipeStep stp66 = new RecipeStep(5,8,"Add the garlic and cook for 1 min, then add the spices and stir.");
			RecipeStep stp67 = new RecipeStep(6,8,"Cook for a couple of mins more until the spices become aromatic");
			RecipeStep stp68 = new RecipeStep(7,8,"Then add half the lime juice and season. Transfer to a dish, leaving any juices behind, and keep warm.");
			RecipeStep stp69 = new RecipeStep(8,8,"Tip the black beans into the same pan, then add the remaining lime juice and plenty of seasoning");
			RecipeStep stp70 = new RecipeStep(9,8,"Stir the beans around the pan to warm them through and help them absorb any flavours then stir through the coriander.");
			RecipeStep stp71 = new RecipeStep(10,8,"Warm the tortillas in a microwave or in a low oven, then wrap them so they don’t dry out.");
			RecipeStep stp72 = new RecipeStep(11,8,"Serve the tortillas with the fajita mix, beans, avocado and soured cream for everyone to help themselves.");
			//Recipe-9
			RecipeStep stp73 = new RecipeStep(1,9,"Heat the oil in a deep lidded frying pan.");
			RecipeStep stp74 = new RecipeStep(2,9,"Cook the onion, garlic, chilli and pepper for 10 minutes until starting to soften.");
			RecipeStep stp75 = new RecipeStep(3,9,"Stir in the basmati, then cook for 3-4 minutes, stirring all the time.");
			RecipeStep stp76 = new RecipeStep(4,9,"Mix in the chipotle paste and cook, stirring for a couple of minutes until fragrant");
			RecipeStep stp77 = new RecipeStep(5,9,"Then tip in the tomatoes and stock, and stir well.");
			RecipeStep stp78 = new RecipeStep(6,9,"Bring to a simmer turning the heat down to low ");
			RecipeStep stp79 = new RecipeStep(7,9,"Put on a lid and cook for 15 minutes or until the rice is cooked through.");
			RecipeStep stp80 = new RecipeStep(8,9,"Stir through the coriander and serve with lime wedges for squeezing.");
			//Recipe-10
			RecipeStep stp81 = new RecipeStep(1,10,"Cook the pasta following pack instructions.");
			RecipeStep stp82 = new RecipeStep(2,10,"Simultaneously, Toss together the tomatoes, olive oil, vinegar, capers and lots of seasoning in a bowl.");
			RecipeStep stp83 = new RecipeStep(3,10,"Drain the pasta then rinse under cold water and drain again.");
			RecipeStep stp84 = new RecipeStep(4,10,"Add to the tomato mixture and toss really well.");
			RecipeStep stp85 = new RecipeStep(5,10,"Leave the mixture for 5 minutes, tossing a few times throughout.");
			RecipeStep stp86 = new RecipeStep(6,10," Add the bocconcini and herbs, and toss again before serving.");
			//Recipe-11
			RecipeStep stp87 = new RecipeStep(1,11,"Take left over bread lightly apply butter on 1 side of the bread slice.");
			RecipeStep stp88 = new RecipeStep(2,11,"Cut chicken/beef into small pieces put it in a bowl use a pinch salt/pepper");
			RecipeStep stp89 = new RecipeStep(3,11,"Add spices if you wish, finally mix well.");
			RecipeStep stp90 = new RecipeStep(4,11,"Toast bread slice if preferable.");
			RecipeStep stp91 = new RecipeStep(5,11,"Unload chicken/beef  on the bread slice.");
			RecipeStep stp92 = new RecipeStep(6,11,"Apply chili sauce if prefereable and cover the sandwich filling with the 2nd slice and enjoy.");
			//Recipe-12
			RecipeStep stp93 = new RecipeStep(1,12,"Take left over chicken pieces and put in a bowl.");
			RecipeStep stp94 = new RecipeStep(1,12,"Add salt,pepper, other prefered spices into the bowl ");
			RecipeStep stp95 = new RecipeStep(1,12,"Next add your preferred sauce can be chili/tomato sauce and mixwell");
			RecipeStep stp96 = new RecipeStep(1,12,"Crack and beat egg in a plate then add chili and salt.");
			RecipeStep stp97 = new RecipeStep(1,12,"Drop chicken/beef pieces into flour if available if not then directly into the egg mixture.");
			RecipeStep stp98 = new RecipeStep(1,12,"Shallow fry until browning appears and serve alongside some salad.");
			//Recipe-13
			RecipeStep stp99 = new RecipeStep(1,13,"Take left over chicken/beef pieces shred it into smaller pieces.");
			RecipeStep stp100 = new RecipeStep(2,13,"Take an egg and seperate the yolk from the white part");
			RecipeStep stp101 = new RecipeStep(3,13,"Add spices to mash potatoes and chicken/beef pieces.");
			RecipeStep stp102 = new RecipeStep(4,13,"Slightly soak slice of bread in water to have a binding element.");
			RecipeStep stp103 = new RecipeStep(5,13,"AMix the mashed potatoes, chicken/beef pieces and bread then mixwell");
			RecipeStep stp104 = new RecipeStep(6,13,"Take a scoop of the potato and chicken/beef mixture then try shape it like a ball.");
			RecipeStep stp105 = new RecipeStep(7,13,"Shallow fry and serve.");
			//Recipe-14
			RecipeStep stp106 = new RecipeStep(1,14,"Take left over chicken/beef shred it");
			RecipeStep stp107 = new RecipeStep(2,14,"Take an egg and seperate the yolk from the white part");
			RecipeStep stp108 = new RecipeStep(3,14,"Put shredded chicken/beef in bowl flavour with spices and sauce");
			RecipeStep stp109 = new RecipeStep(4,14,"Unload chicken/beef from bowl onto flatbread and spread out evenly");
			RecipeStep stp110 = new RecipeStep(5,14,"Apply white part of the egg around corners of the flatbread in good amount.");
			RecipeStep stp111 = new RecipeStep(6,14,"Pour yellow part of egg on the flatbread and spread");
			RecipeStep stp112 = new RecipeStep(7,14,"Cover with 2nd flatbread and use force to ensure they 2 sides are stuck to each other");
			RecipeStep stp113 = new RecipeStep(8,14,"Microwave for 1.5 min and serve");
			//Recipe-15
			RecipeStep stp114 = new RecipeStep(1,15,"Heat a good knob of butter in a pan. ");
			RecipeStep stp115 = new RecipeStep(2,15,"Add garlic and rosemary and let it settle for 30 seconds.");
			RecipeStep stp116 = new RecipeStep(3,15,"Add the mushrooms and fry over a high heat for 5 minutes until they’re golden brown.");
			RecipeStep stp117 = new RecipeStep(4,15,"Season the mushrooms with preferred spices, then spoon onto a plate and set aside.");
			RecipeStep stp118 = new RecipeStep(5,15,"Add another knob of butter to the pan");
			RecipeStep stp119 = new RecipeStep(6,15,"Fry the leeks over a low heat for 10 minutes until softened.");
			RecipeStep stp120 = new RecipeStep(7,15,"Add the wine and bubble until mostly evaporated");
			RecipeStep stp121 = new RecipeStep(8,15,"Then add the soya cream, season well.");
			RecipeStep stp122 = new RecipeStep(9,15,"Then mix in the garlicky mushrooms.");
			RecipeStep stp123 = new RecipeStep(10,15,"Meanwhile, add the pasta to boiling water for 10 minutes");
			RecipeStep stp124 = new RecipeStep(11,15,"Drain the water and mix with the leeks and mushrooms.");
			RecipeStep stp125 = new RecipeStep(12,15,"Season and add in a handful of chopped fresh parsley, then serve.");
			//Recipe-16
			RecipeStep stp126 = new RecipeStep(1,16,"adasdaw");
			RecipeStep stp127 = new RecipeStep(2,16,"adasdaw");
			RecipeStep stp128 = new RecipeStep(3,16,"adasdaw");
			RecipeStep stp129 = new RecipeStep(4,16,"adasdaw");
			RecipeStep stp130 = new RecipeStep(5,16,"adasdaw");
			RecipeStep stp131 = new RecipeStep(6,16,"adasdaw");
			RecipeStep stp132 = new RecipeStep(7,16,"adasdaw");
			RecipeStep stp133 = new RecipeStep(8,16,"adasdaw");
			//Recipe-17
			RecipeStep stp134 = new RecipeStep(1,5,"adasdaw");
			//Recipe-18
			RecipeStep stp135 = new RecipeStep(1,5,"adasdaw");
			//Recipe-19
			RecipeStep stp136 = new RecipeStep(1,5,"adasdaw");
			//Recipe-20
			RecipeStep stp137= new RecipeStep(1,5,"adasdaw");
			//Recipe-21
			RecipeStep stp138 = new RecipeStep(1,5,"adasdaw");
			//Recipe-22
			RecipeStep stp139 = new RecipeStep(1,5,"adasdaw");
			
			repository.saveAll(List.of(stp1, stp2, stp3, stp4, stp5, stp6, stp7, stp8, stp9,
					stp10, stp11, stp12, stp13, stp14, stp15, stp16, stp17, stp18, stp19, stp20));
			
		};
		
	}
}
