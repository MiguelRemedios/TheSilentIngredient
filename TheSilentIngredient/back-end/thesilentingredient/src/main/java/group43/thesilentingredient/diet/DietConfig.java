package group43.thesilentingredient.diet;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DietConfig {

	//						TABLE ALREADY COMPLETED!
	//			DO NOT UNMARK THIS WITHOUT LETTING THE GROUP KNOW
	//					(ANY CHANGE TEXT IN THE GROUP CHAT)
	/*@Bean
	CommandLineRunner commandLineRunner2(DietRepository repository) {
		return args -> {
			Diet halal = new Diet("Halal", "Muslim belief diet");

			Diet Vegan = new Diet("Vegan", "Abstaining from use of animal products");

			Diet Vegetarian = new Diet("Vegetarian", "Abstaining from consumption of meat");
			
			Diet lactoseFree = new Diet ("Lactose Free", "Requires no diary produts");
			
			Diet glutenFree = new Diet ("Gluten Free", "Strictly exclude Gluten");

			repository.saveAll(List.of(halal, Vegan, Vegetarian, lactoseFree, glutenFree));
		};

	}*/
}
