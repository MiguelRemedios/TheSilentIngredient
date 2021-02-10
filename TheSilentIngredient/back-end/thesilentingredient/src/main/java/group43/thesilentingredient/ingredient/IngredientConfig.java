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
			Ingredient dry soya cream = new Ingredient(
					"soya cream",
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
			Ingredient red chilli = new Ingredient(
					"red chilli",
					6,
					0,
					1,
					0
					);
			Ingredient cherry tomatoes can = new Ingredient(
					"cherry tomatoes can",
					25,
					1,
					6,
					1
					);
			Ingredient caster sugar = new Ingredient(
					"caster sugar",
					400,
					0,
					100,
					0
					);
			Ingredient canned white bean = new Ingredient(
					"canned white bean",
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
			Ingredient bay leaves = new Ingredient(
					"bay leaves",
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
			Ingredient red wine = new Ingredient(
					"red wine",
					160,
					0,
					4,
					0
					);
			Ingredient all purpose flour = new Ingredient(
					"all purpose flour",
					360,
					10,
					76,
					1
					);
			Ingredient white sugar = new Ingredient(
					"white sugar",
					407,
					0,
					100,
					0
					);
			Ingredient baking powder = new Ingredient(
					"baking powder",
					2,
					0,
					2,
					0
					);
			Ingredient plant based milk = new Ingredient(
					"plant based milk",
					110,
					5,
					16,
					5
					);
			Ingredient vegetable oil = new Ingredient(
					"vegetable oil",
					120,
					0,
					0,
					14
					);
			Ingredient banana = new Ingredient(
					"banana",
					105,
					1,
					27,
					0
					);
			Ingredient red onion = new Ingredient(
					"red onion",
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
			Ingredient red pepper = new Ingredient(
					"red pepper",
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
			Ingredient vine tomatoes = new Ingredient(
					"vine tomatoes",
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
			Ingredient vegetable stock = new Ingredient(
					"vegetable stock",
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
					dry white wine,
					soya cream,
					pasta,
					parsley,
					red chilli,
					cherry tomatoes can,
					caster sugar,
					canned white bean,
					tempeh,
					carrot,
					celery,
					mushrooms,
					sage,
					thyme,
					bay leaves,
					parsley,
					red wine,
					all purpose flour,
					white sugar,
					baking powder,
					plant based milk,
					vegetable oil,
					banana,
					red onion,
					cumin,
					coriander,
					cinnamon,
					red pepper,
					courgette,
					aubergine,
					vine tomatoes,
					chickpeas,
					vegetable stock,
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
