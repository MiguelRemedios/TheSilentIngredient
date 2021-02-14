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
			Ingredient pickCucumber = new Ingredient(
					"pickling cucumber",
					11,
					0.3,
					2.3,
					0.2
					);
			
			Ingredient cucumber = new Ingredient(
					"cucumber",
					10,
					0.6,
					2.2,
					0.2
					);
			
			Ingredient shallots = new Ingredient(
					"shallots",
					75,
					2.5,
					17,
					0
					);
			Ingredient mustardseeds = new Ingredient(
					"mustard seeds",
					469,
					24.94,
					34.94,
					28.76
					);
			
			Ingredient grdtumeric = new Ingredient(
					"ground turmeric",
					312,
					9.7,
					67,
					3.3
					);
			
			Ingredient stranise = new Ingredient(
					"star anise",
					337,
					17.6,
					50.02,
					15.9
					);
			
			Ingredient castersugar = new Ingredient(
					"caster sugar",
					400,
					0,
					100,
					0
					);
			Ingredient vinegar = new Ingredient(
					"vinegar",
					21,
					0,
					0.9,
					0
					);
			Ingredient onion = new Ingredient(
					"onion",
					40,
					1.1,
					9.3,
					0.1
					);
			
			Ingredient tinchickpeas = new Ingredient(
					"tin chickpeas",
					225,
					7.2,
					20,
					14
					);
			
			Ingredient greenchillies = new Ingredient(
					"green chillies",
					40,
					2,
					9.5,
					0.2
					);
			Ingredient sunfloweroil = new Ingredient(
					"sunflower oil",
					884,
					0,
					0,
					100
					);
			Ingredient sugar = new Ingredient(
					"sugar",
					380,
					0.1,
					98,
					0
					);
			
			Ingredient tintomatoe = new Ingredient(
					"tin tomatoes",
					32,
					1.6,
					7.3,
					0.3
					);
			
			Ingredient redchillipowder = new Ingredient(
					"red chilli powder",
					282,
					13,
					50,
					14
					);
			Ingredient coriander = new Ingredient(
					"coriander",
					23,
					2.1,
					3.7,
					0.5
					);
			Ingredient tinadukibeans = new Ingredient(
					"tin aduki beans",
					329,
					20,
					63,
					0.5
					);
			
			Ingredient brwnsugar = new Ingredient(
					"brown sugar",
					380,
					0.1,
					98,
					0
					);
			
			Ingredient cocoapowder = new Ingredient(
					"cocoa powder",
					228,
					20,
					58,
					14
					);
			Ingredient almonds = new Ingredient(
					"almonds",
					579,
					21,
					22,
					50
					);
			Ingredient vanillaextract = new Ingredient(
					"vanilla extract",
					288,
					0.1,
					13,
					0.1
					);
			
			Ingredient darkdairyfreechoc = new Ingredient(
					"dark dairy-free chocolate",
					598,
					7.8,
					46,
					43
					);
			
			Ingredient icingsgr = new Ingredient(
					"icing sugar",
					418,
					0,
					68,
					16
					);
			Ingredient egg = new Ingredient(
					"egg",
					143,
					13,
					0.7,
					9.5
					);
			Ingredient glutenfreeflour = new Ingredient(
					"gluten-free plain flour",
					340,
					13,
					72,
					2.5
					);
			
			Ingredient milk = new Ingredient(
					"milk",
					34,
					3.4,
					5,
					0.1
					);
			
			Ingredient lemonjc = new Ingredient(
					"lemon juice",
					22,
					0.4,
					6.9,
					0.2
					);
			Ingredient oliveoil = new Ingredient(
					"olive oil",
					884,
					0,
					0,
					100
					);
			Ingredient cardamon = new Ingredient(
					"cardamon",
					311,
					11,
					68,
					6.7
					);
			
			Ingredient salt = new Ingredient(
					"salt",
					0,
					0,
					0,
					0
					);
			
			Ingredient driedyeast = new Ingredient(
					"dried yeast",
					325,
					40,
					41,
					7.6
					);
			Ingredient buttermilk = new Ingredient(
					"buttermilk",
					62,
					3.2,
					4.9,
					3.3
					);
			Ingredient blackbeanstin = new Ingredient(
					"tin black beans",
					91,
					6,
					17,
					0.3
					);
			Ingredient avocado = new Ingredient(
					"avocado",
					160,
					2,
					8.5,
					15
					);
			Ingredient garlic = new Ingredient(
					"garlic",
					149,
					6.4,
					33,
					0.5
					);
			
			Ingredient banana = new Ingredient(
					"banana",
					3,
					2,
					1,
					1
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
					"olive oil",
					119,
					0,
					0,
					13
					);
			
			Ingredient ground_beef = new Ingredient(
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
			Ingredient pasta_sauce = new Ingredient(
					"pasta_sauce",
					130,
					4,
					20,
					4
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
					"light mayonnaise",
					20,
					0,
					6,
					1
					);
			Ingredient black_pepper = new Ingredient(
					"black pepper",
					4,
					0,
					1,
					0
					);
			Ingredient bread_crumbs = new Ingredient(
					"bread crumbs",
					450,
					17,
					80,
					6
					);
			Ingredient garlic_glove = new Ingredient(
					"garlic glove",
					13,
					0,
					3,
					0
					);
			Ingredient rosemary_sprigs = new Ingredient(
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
			Ingredient dry_white_wine = new Ingredient(
					"dry white wine",
					120,
					0,
					4,
					0
					);
			Ingredient dry_soya_cream = new Ingredient(
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
			Ingredient red_chilli = new Ingredient(
					"red chilli",
					6,
					0,
					1,
					0
					);
			Ingredient cherry_tomatoes_can = new Ingredient(
					"cherry tomatoes can",
					25,
					1,
					6,
					1
					);
		
			Ingredient canned_white_bean = new Ingredient(
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
			Ingredient bay_leaves = new Ingredient(
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
			Ingredient red_wine = new Ingredient(
					"red wine",
					160,
					0,
					4,
					0
					);
			Ingredient all_purpose_flour = new Ingredient(
					"all purpose flour",
					360,
					10,
					76,
					1
					);
			Ingredient white_sugar = new Ingredient(
					"white sugar",
					407,
					0,
					100,
					0
					);
			Ingredient baking_powder = new Ingredient(
					"baking powder",
					2,
					0,
					2,
					0
					);
			Ingredient plant_based_milk = new Ingredient(
					"plant based milk",
					110,
					5,
					16,
					5
					);
			Ingredient vegetable_oil = new Ingredient(
					"vegetable oil",
					120,
					0,
					0,
					14
					);
			
			Ingredient red_onion = new Ingredient(
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
			Ingredient cinnamon = new Ingredient(
					"cinnamon",
					0,
					0,
					6,
					0
					);
			Ingredient red_pepper = new Ingredient(
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
			Ingredient vine_tomatoes = new Ingredient(
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
			Ingredient vegetable_stock = new Ingredient(
					"vegetable stock",
					15,
					1,
					3,
					0
					);
			Ingredient harissa = new Ingredient(
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
			
			repository.saveAll(List.of(
					banana,
					water,
					white_rice,
					olive_oil,
					ground_beef,
					spaghetti,
					pasta_sauce,
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
					dry_soya_cream,
					pasta,
					parsley,
					red_chilli,
					cherry_tomatoes_can,
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
					flatbread,
					pickCucumber,
					cucumber,
					shallots,
					mustardseeds,
					grdtumeric,
					stranise,
					castersugar,
					vinegar,
					onion,
					tinchickpeas,
					greenchillies,
					sunfloweroil,
					sugar,
					tintomatoe,
					redchillipowder,
					coriander,
					tinadukibeans,
					brwnsugar,
					cocoapowder,
					almonds,
					vanillaextract,
					darkdairyfreechoc,
					icingsgr,
					egg,
					glutenfreeflour,
					milk,
					lemonjc,
					oliveoil,
					cardamon,
					salt,
					driedyeast,
					buttermilk,
					blackbeanstin,
					avocado,
					garlic)
					);
		};

	}
}
