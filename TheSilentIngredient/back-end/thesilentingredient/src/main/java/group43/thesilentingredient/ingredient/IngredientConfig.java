package group43.thesilentingredient.ingredient;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IngredientConfig {    

	//						TABLE ALREADY COMPLETED!
	//			DO NOT UNMARK THIS WITHOUT LETTING THE GROUP KNOW
	//					(ANY CHANGE TEXT IN THE GROUP CHAT)
	@Bean
	CommandLineRunner commandLineRunner10(IngredientRepository repository) {
		return args -> {
			
			Ingredient grmMasala = new Ingredient(
					"garam masala",
					306.6,
					11.3,
					56.7,
					12.7
					);
			
			Ingredient grndFlaxseed = new Ingredient(
					"ground flaxseed",
					534,
					19,
					30,
					43
					);
			Ingredient gfBakingPowder = new Ingredient(
					"gluten-free baking powder",
					160,
					0.1,
					60,
					0
					);
			Ingredient ccntCream = new Ingredient(
					"coconut cream",
					327,
					3.6,
					6.7,
					34.7
					);
			Ingredient tahini = new Ingredient(
					"tahini",
					593.3,
					20,
					20,
					53.3
					);
			Ingredient grndCoriander = new Ingredient(
					"ground coriander",
					593.3,
					20,
					20,
					53.3
					);
			Ingredient flourTortillas = new Ingredient(
					"flour tortillas",
					324.4,
					8.8,
					55.1,
					7.1
					);
			
			Ingredient souredCream = new Ingredient(
					"soured cream",
					196.6,
					2.3,
					43.3,
					19.3
					);
			Ingredient groundnutOil = new Ingredient(
					"groundnut oil",
					884,
					0,
					0,
					100
					);
			Ingredient greenPepper = new Ingredient(
					"green pepper",
					28,
					0.9,
					6.7,
					0.2
					);
			Ingredient basmatiRice = new Ingredient(
					"basmati rice",
					121,
					3.54,
					25.22,
					0.38
					);
			Ingredient chipotlePaste = new Ingredient(
					"chipotle paste",
					48,
					1.9,
					9,
					0.4
					);
			Ingredient vegetableStock = new Ingredient(
					"vegetable stock",
					5.9,
					0.2,
					1,
					0.1
					);
			Ingredient lime = new Ingredient(
					"lime",
					23,
					0.3,
					7.6,
					0
					);
			Ingredient capers = new Ingredient(
					"capers",
					23,
					2.4,
					4.9,
					0.9
					);
			Ingredient bocconcini = new Ingredient(
					"bocconcini",
					211.6,
					21.2,
					0,
					12.3
					);
			Ingredient basil = new Ingredient(
					"basil",
					22,
					3.2,
					2.7,
					0.6
					);
			Ingredient chives = new Ingredient(
					"chives",
					30,
					3.3,
					4.4,
					0.7
					);
			Ingredient asafoetida = new Ingredient(
					"asafoetida",
					297.1,
					4,
					67.8,
					1.1
					);
			Ingredient freshGingerPaste = new Ingredient(
					"fresh ginger paste",
					210.6,
					1.5,
					14.7,
					16.8
					);
			Ingredient garlicPaste = new Ingredient(
					"garlic paste",
					422,
					3.4,
					18.8,
					39.1
					);
			Ingredient greenChilliPaste = new Ingredient(
					"green chilli paste",
					175.1,
					2.1,
					43.8,
					0.8
					);
			Ingredient turmeric = new Ingredient(
					"turmeric",
					352.97,
					6.89,
					73.6,
					3.89
					);
			Ingredient dhanaJeeraPwdr = new Ingredient(
					"dhana jeera powder",
					346,
					7,
					45,
					2
					);
	
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
					9,
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
					155,
					13,
					1.1,
					11
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
			Ingredient cardamom = new Ingredient(
					"cardamom",
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
					161,
					2,
					8.5,
					14.5
					);
			
			Ingredient banana = new Ingredient(
					"banana",
					89,
					1.1,
					22.9,
					0.3
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
					129.8,
					2.7,
					28.5,
					0.3
					);
			
			Ingredient ground_beef = new Ingredient(
					"ground beef",
					272.6,
					27.4,
					0,
					17.7
					);
			Ingredient spaghetti = new Ingredient(
					"spaghetti",
					149.9,
					5.3,
					30,
					0.6
					);
			Ingredient pasta_sauce = new Ingredient(
					"pasta sauce",
					50,
					1.4,
					7.4,
					1.6
					);

			Ingredient chicken_breast = new Ingredient(
					"chicken breast",
					164.9,
					30.8,
					0,
					3.6
					);
			Ingredient bagel = new Ingredient(
					"bagel",
					263.7,
					10.5,
					52.4,
					1.3
					);
			Ingredient lettuce = new Ingredient(
					"lettuce",
					17,
					1.3,
					3.3,
					0.3
					);
			Ingredient light_mayonnaise = new Ingredient(
					"light mayonnaise",
					240.1,
					0.4,
					9.3,
					22
					);
			Ingredient black_pepper = new Ingredient(
					"black pepper",
					252.3,
					10.4,
					65.3,
					3.5
					);
			Ingredient bread_crumbs = new Ingredient(
					"bread crumbs",
					399.8,
					13.6,
					71.4,
					5.4
					);
			Ingredient garlic_clove = new Ingredient(
					"garlic",
					150,
					6.3,
					33,
					0.7
					);
			Ingredient rosemary_sprigs = new Ingredient(
					"rosemary",
					333.2,
					5,
					64.1,
					15
					);
			Ingredient leek = new Ingredient(
					"leek",
					30.6,
					0.8,
					7.6,
					0.2
					);
			Ingredient dry_white_wine = new Ingredient(
					"dried white wine",
					66,
					0.1,
					0.6,
					0
					);
			Ingredient dry_soya_cream = new Ingredient(
					"soya cream",
					200,
					2,
					32,
					8
					);
			Ingredient red_chilli = new Ingredient(
					"red chilli",
					37,
					2,
					7,
					0.3
					);
			Ingredient cherry_tomatoes_can = new Ingredient(
					"canned cherry tomatoes",
					32.2,
					1.7,
					21.2,
					0.3
					);
		
			Ingredient canned_white_bean = new Ingredient(
					"canned white beans",
					114.2,
					7.3,
					21.2,
					0.3
					);
			Ingredient tempeh = new Ingredient(
					"tempeh",
					196.3,
					20,
					7.9,
					11.4
					);
			Ingredient carrot = new Ingredient(
					"carrot",
					16,
					0.3,
					3.8,
					0.1
					);
			Ingredient celery = new Ingredient(
					"celery",
					16,
					0.7,
					3,
					0.2
					);
			Ingredient mushrooms = new Ingredient(
					"mushrooms",
					28.3,
					2.2,
					5.2,
					0.5
					);
			Ingredient sage = new Ingredient(
					"sage",
					314.4,
					10,
					61.4,
					12.9
					);
			Ingredient thyme = new Ingredient(
					"thyme",
					101.3,
					5,
					25,
					1.3
					);
			Ingredient bay_leaves = new Ingredient(
					"bay leaves",
					315,
					10,
					75,
					10
					);
			Ingredient parsley = new Ingredient(
					"parsley",
					36.8,
					2.9,
					6.3,
					0.8
					);
			Ingredient red_wine = new Ingredient(
					"red wine",
					85,
					0.1,
					2.6,
					0
					);
			Ingredient all_purpose_flour = new Ingredient(
					"flour",
					364,
					10.4,
					76,
					1
					);
			Ingredient baking_powder = new Ingredient(
					"baking powder",
					52.2,
					0,
					28.3,
					0
					);
			Ingredient plant_based_milk = new Ingredient(
					"plant based milk",
					41.2,
					2.9,
					3.3,
					1.6
					);
			Ingredient vegetable_oil = new Ingredient(
					"vegetable oil",
					856.8,
					0,
					0,
					100
					);
			
			Ingredient red_onion = new Ingredient(
					"red onion",
					42.2,
					1.3,
					9.8,
					0.2
					);
			Ingredient cumin = new Ingredient(
					"cumin",
					376,
					17.6,
					44.3,
					22.4
					);
			Ingredient cinnamon = new Ingredient(
					"cinnamon",
					246.1,
					3.8,
					80.7,
					1.2
					);
			Ingredient red_pepper = new Ingredient(
					"red pepper",
					28.1,
					0.9,
					6.7,
					0.2
					);
			Ingredient courgette = new Ingredient(
					"courgette",
					15.2,
					1.2,
					2.7,
					0.4
					);
			Ingredient aubergine = new Ingredient(
					"aubergine",
					35,
					0.8,
					8.7,
					0.2
					);
			Ingredient vine_tomatoes = new Ingredient(
					"vine tomatoes",
					17.9,
					0.9,
					3.9,
					0.2
					);
			Ingredient chickpeas = new Ingredient(
					"chickpeas",
					164.1,
					9.2,
					27.4,
					2.6
					);
			Ingredient harissa = new Ingredient(
					"harrisa",
					328.4,
					6.2,
					27.1,
					25
					);
			Ingredient prunes = new Ingredient(
					"prunes",
					275,
					2.5,
					65,
					0
					);
			Ingredient couscous = new Ingredient(
					"couscous",
					112,
					3.8,
					23,
					0.2
					);
			Ingredient bread = new Ingredient(
					"bread",
					265,
					9,
					49,
					3.2
					);
			Ingredient potatoes = new Ingredient(
					"potatoes",
					87,
					1.9,
					20.1,
					0.1
					);
			Ingredient flatbread = new Ingredient(
					"flatbread",
					300,
					8,
					48,
					7
					);
			Ingredient bacon = new Ingredient(
					"bacon",
					541,
					67,
					1.4,
					42
					);
			Ingredient vanilla_ice_cream = new Ingredient(
					"vanilla ice cream",
					192,
					2.1,
					29,
					7.4
					);
			Ingredient root_beer = new Ingredient(
					"root beer",
					21,
					0,
					5.1,
					0
					);
			Ingredient red_wine_vinegar = new Ingredient(
					"red wine vinegar",
					20,
					0.5,
					0.5,
					0
					);
			Ingredient pasta = new Ingredient(
					"pasta",
					131,
					5,
					25,
					1.1
					);
			Ingredient regular_tomatoes = new Ingredient(
					"tomatoes",
					18,
					0.9,
					3.9,
					0.2
					);
			Ingredient chili_powder = new Ingredient(
					"chili powder",
					282,
					13,
					50,
					14
					);
			Ingredient chili_sauce = new Ingredient(
					"chili sauce",
					11,
					0.5,
					1.8,
					0.4
					);
			


			repository.saveAll(List.of(
					banana,
					water,
					white_rice,
					oliveoil,
					ground_beef,
					spaghetti,
					pasta_sauce,
					chicken_breast,
					bagel,
					vine_tomatoes,
					lettuce,
					light_mayonnaise,
					black_pepper,
					bread_crumbs,
					garlic_clove,
					rosemary_sprigs,
					leek,
					dry_white_wine,
					dry_soya_cream,
					pasta,
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
					harissa,
					prunes,
					couscous,
					bread,
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
					cardamom,
					salt,
					driedyeast,
					buttermilk,
					blackbeanstin,
					avocado,
					grmMasala,
					grndFlaxseed,
					gfBakingPowder,
					ccntCream,
					tahini,
					grndCoriander,
					flourTortillas,
					souredCream,
					groundnutOil,
					greenPepper,
					basmatiRice,
					chipotlePaste,
					vegetableStock,
					lime,
					capers,
					bocconcini,
					basil,
					chives,
					asafoetida,
					freshGingerPaste,
					garlicPaste,
					greenChilliPaste,
					turmeric,
					dhanaJeeraPwdr,
					bacon,
					vanilla_ice_cream,
					root_beer,
					red_wine_vinegar, 
					regular_tomatoes, chili_powder, chili_sauce)
					);
		};

	}
}
