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
			
			Ingredient water = new Ingredient(
					"water",
					0,
					0,
					0,
					0
					);
			Ingredient white_rice = new Ingredient(
					"white rice",
					68,
					1,
					15,
					0
					);
			
			Ingredient olive_oil = new Ingredient(
					"olive_oil",
					119,
					0,
					0,
					13
					);
			
			Ingredient ground_beef = new Ingredient(
					"ground_beef",
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
			Ingredient pasta_sauce = new Ingredient(
					"pasta_sauce",
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
			Ingredient chicken_breast = new Ingredient(
					"chicken_breast",
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
			Ingredient light_mayonnaise = new Ingredient(
					"light_mayonnaise",
					20,
					0,
					6,
					1
					);
			Ingredient black_pepper = new Ingredient(
					"black_pepper",
					4,
					0,
					1,
					0
					);
			Ingredient bread_crumbs = new Ingredient(
					"bread_crumbs",
					450,
					17,
					80,
					6
					);
			Ingredient garlic_glove = new Ingredient(
					"garlic_glove",
					13,
					0,
					3,
					0
					);
			Ingredient rosemary_sprigs = new Ingredient(
					"rosemary_sprigs",
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
			Ingredient dry white_wine = new Ingredient(
					"dry white_wine",
					120,
					0,
					4,
					0
					);
			Ingredient dry soya_cream = new Ingredient(
					"soya_cream",
					140,
					2,
					1,
					14
					);
			Ingredient pasta = new Ingredient(
					"pasta",
					174,
					8,
					40,
					1
					);
			Ingredient red_chilli = new Ingredient(
					"red_chilli",
					6,
					0,
					1,
					0
					);
			Ingredient cherry_tomatoes_can = new Ingredient(
					"cherry_tomatoes_can",
					25,
					1,
					6,
					1
					);
			Ingredient caster_sugar = new Ingredient(
					"caster_sugar",
					400,
					0,
					100,
					0
					);
			Ingredient canned_white_bean = new Ingredient(
					"canned_white_bean",
					242,
					17,
					44,
					0
					);
			Ingredient tempeh = new Ingredient(
					"tempeh",
					140,
					16,
					10,
					5
					);
			Ingredient carrot = new Ingredient(
					"carrot",
					41,
					1,
					10,
					0
					);
			Ingredient celery = new Ingredient(
					"celery",
					14,
					0,
					3,
					0
					);
			Ingredient mushrooms = new Ingredient(
					"mushrooms",
					14,
					0,
					3,
					0
					);
			Ingredient sage = new Ingredient(
					"sage",
					2,
					0,
					0,
					0
					);
			Ingredient thyme = new Ingredient(
					"thyme",
					2,
					0,
					0,
					0
					);
			Ingredient bay_leaves = new Ingredient(
					"bay_leaves",
					5,
					0,
					0,
					0
					);
			Ingredient parsley = new Ingredient(
					"parsley",
					11,
					1,
					2,
					0
					);
			Ingredient red_wine = new Ingredient(
					"red_wine",
					160,
					0,
					4,
					0
					);
			Ingredient all_purpose_flour = new Ingredient(
					"all_purpose_flour",
					360,
					10,
					76,
					1
					);
			Ingredient white_sugar = new Ingredient(
					"white_sugar",
					407,
					0,
					100,
					0
					);
			Ingredient baking_powder = new Ingredient(
					"baking_powder",
					2,
					0,
					2,
					0
					);
			Ingredient plant_based_milk = new Ingredient(
					"plant_based_milk",
					110,
					5,
					16,
					5
					);
			Ingredient vegetable_oil = new Ingredient(
					"vegetable_oil",
					120,
					0,
					0,
					14
					);
			
			Ingredient red_onion = new Ingredient(
					"red_onion",
					40,
					1,
					9,
					0
					);
			Ingredient cumin = new Ingredient(
					"cumin",
					22,
					1,
					3,
					1
					);
			Ingredient coriander = new Ingredient(
					"coriander",
					23,
					2,
					4,
					0
					);
			Ingredient cinnamon = new Ingredient(
					"cinnamon",
					0,
					0,
					6,
					0
					);
			Ingredient red_pepper = new Ingredient(
					"red_pepper",
					39,
					1,
					9,
					0
					);
			Ingredient courgette = new Ingredient(
					"courgette",
					21,
					1,
					4,
					0
					);
			Ingredient aubergine = new Ingredient(
					"aubergine",
					20,
					2,
					5,
					0
					);
			Ingredient vine_tomatoes = new Ingredient(
					"vine_tomatoes",
					16,
					1,
					3,
					0
					);
			Ingredient chickpeas = new Ingredient(
					"chickpeas",
					210,
					10,
					35,
					4
					);
			Ingredient vegetable_stock = new Ingredient(
					"vegetable_stock",
					15,
					1,
					3,
					0
					);
			Ingredient harrisa = new Ingredient(
					"harrisa",
					170,
					1,
					4,
					17
					);
			Ingredient prunes = new Ingredient(
					"prunes",
					115,
					1,
					30,
					0
					);
			Ingredient couscous = new Ingredient(
					"couscous",
					174,
					6,
					36,
					0
					);
			Ingredient bread = new Ingredient(
					"bread",
					54,
					2,
					11,
					0
					);
			Ingredient sauce = new Ingredient(
					"sauce",
					12,
					0,
					3,
					2
					);
			Ingredient potatoes = new Ingredient(
					"potatoes",
					110,
					3,
					26,
					0
					);
			Ingredient flatbread = new Ingredient(
					"flatbread",
					150,
					4,
					24,
					3
					);
			
			repository.saveAll(List.of(egg,
					milk,
					banana,
					cucumber,
					water,
					white_rice,
					olive_oil,
					ground_beef,
					spaghetti,
					pasta_sauce,
					onion,
					chicken_breast,
					bagel,
					tomatoes,
					lettuce,
					light_mayonnaise,
					black_pepper,
					bread_crumbs,
					garlic_glove,
					rosemary_sprigs,
					leek,
					dry_white_wine,
					soya_cream,
					pasta,
					parsley,
					red_chilli,
					cherry_tomatoes_can,
					caster_sugar,
					canned_white_bean,
					tempeh,
					carrot,
					celery,
					mushrooms,
					sage,
					thyme,
					bay_leaves,
					parsley,
					red_wine,
					all_purpose_flour,
					white_sugar,
					baking_powder,
					plant_based_milk,
					vegetable_oil,
					red_onion,
					cumin,
					coriander,
					cinnamon,
					red_pepper,
					courgette,
					aubergine,
					vine_tomatoes,
					chickpeas,
					vegetable_stock,
					harissa,
					prunes,
					couscous,
					bread,
					sauce,
					potatoes,
					flatbread)
					);
		};

	}
}
