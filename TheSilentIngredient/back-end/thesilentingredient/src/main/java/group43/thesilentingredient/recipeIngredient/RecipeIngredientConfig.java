package group43.thesilentingredient.recipeIngredient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RecipeIngredientConfig {

	@Bean
	CommandLineRunner RecipeIngredientsCR(RecipeIngredientRepository repository) {
		return args -> {
			
			//OBJECT NAME'S METHODOLOGY
			//r = recipe
			//{id}
			//ing = ingredient
			//{nr} = ingredient number
			// *** r{id}ing{nr} ***
			
			//ingredient_id, recipe_id, quantity, measurement
			
			//RECIPE ID - 1
			RecipeIngredient r1ing1 = new RecipeIngredient(2, 1, 92.5, "g");
			RecipeIngredient r1ing2 = new RecipeIngredient(3, 1, 100.0, "ml");
			RecipeIngredient r1ing3 = new RecipeIngredient(83, 1, 1.0, "tsp");
			//r1ing1, r1ing2, r1ing3
			
					
			//RECIPE ID - 2
			RecipeIngredient r2ing1 = new RecipeIngredient(81, 2, 1.0, "tbsp");
			RecipeIngredient r2ing2 = new RecipeIngredient(5, 2, 450.0, "g");
			RecipeIngredient r2ing3 = new RecipeIngredient(6, 2, 340.0, "g");
			RecipeIngredient r2ing4 = new RecipeIngredient(7, 2, 550.0, "g");
			RecipeIngredient r2ing5 = new RecipeIngredient(62, 2, 1.0, "quantity");
			//r2ing1, r2ing2, r2ing3, r2ing4, r2ing5
			
			
			//RECIPE ID - 3
			RecipeIngredient r3ing1 = new RecipeIngredient(8, 3, 1.0, "quantity");
			RecipeIngredient r3ing2 = new RecipeIngredient(9, 3, 1.0, "quantity");
			RecipeIngredient r3ing3 = new RecipeIngredient(10, 3, 3.0, "quantity");
			RecipeIngredient r3ing4 = new RecipeIngredient(11, 3, 2.0, "quantity");
			RecipeIngredient r3ing5 = new RecipeIngredient(12, 3, 1.0, "tbsp");
			//r3ing1, r3ing2, r3ing3, r3ing4, r3ing5
			
			//RECIPE ID - 4
			RecipeIngredient r4ing1 = new RecipeIngredient(77, 4, 1.0, "quantity");
			RecipeIngredient r4ing2 = new RecipeIngredient(83, 4, 0.5, "tsp");
			RecipeIngredient r4ing3 = new RecipeIngredient(13, 4, 0.5, "tsp");
			RecipeIngredient r4ing4 = new RecipeIngredient(5, 4, 450.0, "g");
			RecipeIngredient r4ing5 = new RecipeIngredient(14, 4, 60.0, "g");
			//r4ing1, r4ing2, r4ing3, r4ing4, r4ing5
			
			
			//RECIPE ID - 5
			RecipeIngredient r5ing1 = new RecipeIngredient(54, 5, 6.0, "quantity");
			RecipeIngredient r5ing2 = new RecipeIngredient(56, 5, 2.0, "quantity");
			RecipeIngredient r5ing3 = new RecipeIngredient(57, 5, 2.0, "tsp");
			RecipeIngredient r5ing4 = new RecipeIngredient(58, 5, 0.5, "tsp");
			RecipeIngredient r5ing5 = new RecipeIngredient(59, 5, 2.0, "quantity");
			RecipeIngredient r5ing6 = new RecipeIngredient(60, 5, 75.0, "g");
			RecipeIngredient r5ing7 = new RecipeIngredient(61, 5, 150.0, "g");
			//r5ing1, r5ing2, r5ing3, r5ing4, r5ing5, r5ing6, r5ing7
			
			
			//RECIPE ID - 6
			RecipeIngredient r6ing1 = new RecipeIngredient(62, 6, 2.0, "quantity");
			RecipeIngredient r6ing2 = new RecipeIngredient(63, 6, 400.0, "g");
			RecipeIngredient r6ing3 = new RecipeIngredient(64, 6, 1.5, "quantity");
			RecipeIngredient r6ing4 = new RecipeIngredient(65, 6, 2.0, "tbsp");
			RecipeIngredient r6ing5 = new RecipeIngredient(57, 6, 1.0, "tsp");
			RecipeIngredient r6ing6 = new RecipeIngredient(107, 6, 0.5, "tsp");
			RecipeIngredient r6ing7 = new RecipeIngredient(60, 6, 2.0, "tsp");
			RecipeIngredient r6ing8 = new RecipeIngredient(67, 6, 400.0, "g");
			RecipeIngredient r6ing9 = new RecipeIngredient(108, 6, 1.0, "tsp");
			RecipeIngredient r6ing10 = new RecipeIngredient(88, 6, 1.0, "tsp");
			RecipeIngredient r6ing11 = new RecipeIngredient(110, 6, 1.0, "tsp");
			RecipeIngredient r6ing12 = new RecipeIngredient(68, 6, 1.0, "tsp");
			RecipeIngredient r6ing13 = new RecipeIngredient(58, 6, 2.0, "tsp");
			RecipeIngredient r6ing14 = new RecipeIngredient(112, 6, 75.0, "g");
			RecipeIngredient r6ing15 = new RecipeIngredient(69, 6, 3.0, "quantity");
			RecipeIngredient r6ing16 = new RecipeIngredient(89, 6, 75.0, "g");
			//r6ing1, r6ing2, r6ing3, r6ing4, r6ing5, r6ing6, r6ing7, r6ing8, r6ing9, r6ing10, r6ing11, r6ing12, r6ing13, r6ing14, r6ing15, r6ing16
			
			
			//RECIPE ID - 7
			RecipeIngredient r7ing1 = new RecipeIngredient(65, 7, 75.0, "ml");
			RecipeIngredient r7ing2 = new RecipeIngredient(90, 7, 6.0, "tbsp");
			RecipeIngredient r7ing3 = new RecipeIngredient(70, 7, 400.0, "g");
			RecipeIngredient r7ing4 = new RecipeIngredient(72, 7, 55.0, "g");
			RecipeIngredient r7ing5 = new RecipeIngredient(73, 7, 55.0, "g");
			RecipeIngredient r7ing6 = new RecipeIngredient(35, 7, 1.0, "tsp");
			RecipeIngredient r7ing7 = new RecipeIngredient(74, 7, 1.5, "tsp");
			RecipeIngredient r7ing8 = new RecipeIngredient(75, 7, 1.0, "tsp");
			RecipeIngredient r7ing9 = new RecipeIngredient(92, 7, 200.0, "ml");
			RecipeIngredient r7ing10 = new RecipeIngredient(76, 7, 3.0, "tbsp");
			//r7ing1, r7ing2, r7ing3, r7ing4, r7ing5, r7ing6, r7ing7, r7ing8, r7ing9, r7ing10
			
			//RECIPE ID - 8
			RecipeIngredient r8ing1 = new RecipeIngredient(86, 8, 400.0, "g");
			RecipeIngredient r8ing2 = new RecipeIngredient(69, 8, 5.0, "g");
			RecipeIngredient r8ing3 = new RecipeIngredient(95, 8, 8.0, "quantity");
			RecipeIngredient r8ing4 = new RecipeIngredient(87, 8, 1.0, "quantity");
			RecipeIngredient r8ing5 = new RecipeIngredient(96, 8, 2.0, "tbsp");
			//r8ing1, r8ing2, r8ing3, r8ing4, r8ing5
			
			//RECIPE ID - 9
			RecipeIngredient r9ing1 = new RecipeIngredient(97, 9, 75.0, "ml");
			RecipeIngredient r9ing2 = new RecipeIngredient(62, 9, 1.0, "quantity");
			RecipeIngredient r9ing3 = new RecipeIngredient(15, 9, 2.0, "cloves");
			RecipeIngredient r9ing4 = new RecipeIngredient(64, 9, 1.0, "quantity");
			RecipeIngredient r9ing5 = new RecipeIngredient(98, 9, 1.0, "quantity");
			RecipeIngredient r9ing6 = new RecipeIngredient(3, 9, 200.0, "g");
			RecipeIngredient r9ing7 = new RecipeIngredient(100, 9, 1.0, "tbsp");
			RecipeIngredient r9ing8 = new RecipeIngredient(67, 9, 400.0, "g");
			RecipeIngredient r9ing9 = new RecipeIngredient(46, 9, 250.0, "ml");
			RecipeIngredient r9ing10 = new RecipeIngredient(69, 9, 5.0, "g");
			RecipeIngredient r9ing11 = new RecipeIngredient(102, 9, 0.25, "quantity");
			//r9ing1, r9ing2, r9ing3, r9ing4, r9ing5, r9ing6, r9ing7, r9ing8, r9ing9, r9ing10, r9ing11
			
			//RECIPE ID - 10
			RecipeIngredient r10ing1 = new RecipeIngredient(20, 10, 150.0, "g");
			RecipeIngredient r10ing2 = new RecipeIngredient(44, 10, 3.0, "quantity");
			RecipeIngredient r10ing3 = new RecipeIngredient(81, 10, 2.0, "tbsp");
			//RecipeIngredient r10ing4 = new RecipeIngredient(red wine vinegar, 10, 1.0, "tbsp");
			RecipeIngredient r10ing5 = new RecipeIngredient(103, 10, 1.0, "tbsp");
			RecipeIngredient r10ing6 = new RecipeIngredient(104, 10, 150.0, "g");
			RecipeIngredient r10ing7 = new RecipeIngredient(105, 10, 1.0, "g");
			RecipeIngredient r10ing8 = new RecipeIngredient(106, 10, 2.0, "tbsp");
			//r10ing1, r10ing2, r10ing3, r10ing5, r10ing6, r10ing7, r10ing8
			
			//RECIPE ID - 5
			RecipeIngredient r11ing1 = new RecipeIngredient(8, 11, 50.0, "g");
			RecipeIngredient r11ing2 = new RecipeIngredient(50, 11, 2.0, "slices");
			RecipeIngredient r11ing3 = new RecipeIngredient(83, 11, 0.25, "tsp");
			RecipeIngredient r11ing4 = new RecipeIngredient(16, 11, 0.25, "tsp");
			RecipeIngredient r11ing5 = new RecipeIngredient(51, 11, 1.0, "tbsp");
			//r11ing1, r11ing2, r11ing3, r11ing4, r11ing5,

			
			// RECIPE ID - 12
			RecipeIngredient r12ing1 = new RecipeIngredient(8, 12, 340.0, "g");
			RecipeIngredient r12ing2 = new RecipeIngredient(83, 12, 1.0, "tbsp");
			RecipeIngredient r12ing3 = new RecipeIngredient(77, 12, 114.0, "g");
			RecipeIngredient r12ing4 = new RecipeIngredient(81, 12, 250.0, "ml");
			RecipeIngredient r12ing5 = new RecipeIngredient(33, 12, 50.0, "g");
			
			
			// RECIPE ID - 13
			RecipeIngredient r13ing1 = new RecipeIngredient(8, 13, 340.0, "g");
			RecipeIngredient r13ing2 = new RecipeIngredient(52, 13, 540.0, "g");
			RecipeIngredient r13ing3 = new RecipeIngredient(50, 13, 80.0, "g");
			RecipeIngredient r13ing4 = new RecipeIngredient(83, 13, 1.0, "tbsp");
			RecipeIngredient r13ing5 = new RecipeIngredient(81, 13, 350.0, "ml");
			
			
			// RECIPE ID - 14
			RecipeIngredient r14ing1 = new RecipeIngredient(8, 14, 170.0, "g");
			RecipeIngredient r14ing2 = new RecipeIngredient(77, 14, 114.0, "g");
			RecipeIngredient r14ing3 = new RecipeIngredient(53, 14, 80.0, "g");
			RecipeIngredient r14ing4 = new RecipeIngredient(83, 14, 1.0, "tbsp");
			RecipeIngredient r14ing5 = new RecipeIngredient(68, 14, 2.0, "tbsp");
			RecipeIngredient r14ing6 = new RecipeIngredient(81, 14, 15.0, "ml");
			
			
			// RECIPE ID - 15
			RecipeIngredient r15ing1 = new RecipeIngredient(28, 15, 200.0, "g");
			RecipeIngredient r15ing2 = new RecipeIngredient(81, 15, 3.0, "tbsp");
			RecipeIngredient r15ing3 = new RecipeIngredient(15, 15, 15.0, "g");
			RecipeIngredient r15ing4 = new RecipeIngredient(16, 15, 5.0, "g");
			RecipeIngredient r15ing5 = new RecipeIngredient(17, 15, 270.0, "g");
			RecipeIngredient r15ing6 = new RecipeIngredient(18, 15, 125.0, "ml");
			RecipeIngredient r15ing7 = new RecipeIngredient(19, 15, 90.0, "ml");
			RecipeIngredient r15ing8 = new RecipeIngredient(20, 15, 350.0, "g");
			RecipeIngredient r15ing9 = new RecipeIngredient(21, 15, 50.0, "g");
						
						
			//RECIPE ID - 16
			RecipeIngredient r16ing1 = new RecipeIngredient(81, 16, 90.0, "g");
			RecipeIngredient r16ing2 = new RecipeIngredient(38, 16, 220.0, "g");
			RecipeIngredient r16ing3 = new RecipeIngredient(22, 16, 45.0, "g");
			RecipeIngredient r16ing4 = new RecipeIngredient(15, 16, 5.0, "g");
			RecipeIngredient r16ing5 = new RecipeIngredient(69, 16, 16.0, "g");
			RecipeIngredient r16ing6 = new RecipeIngredient(23, 16, 800.0, "ml");
			RecipeIngredient r16ing7 = new RecipeIngredient(60, 16, 1.0, "tsp");
			RecipeIngredient r16ing8 = new RecipeIngredient(77, 16, 228.0, "g");
			
			
			//RECIPE ID - 17
			RecipeIngredient r17ing1 = new RecipeIngredient(24, 17, 510.0, "g");
			RecipeIngredient r17ing2 = new RecipeIngredient(25, 17, 226.0, "g");
			RecipeIngredient r17ing3 = new RecipeIngredient(4, 17, 1.0, "tbsp");
			RecipeIngredient r17ing4 = new RecipeIngredient(62, 17, 110.0, "g");
			RecipeIngredient r17ing5 = new RecipeIngredient(26, 17, 100.0, "g");
			RecipeIngredient r17ing6 = new RecipeIngredient(27, 17, 80.0, "g");
			RecipeIngredient r17ing7 = new RecipeIngredient(15, 17, 25.0, "g");
			RecipeIngredient r17ing8 = new RecipeIngredient(28, 17, 300.0, "g");
			RecipeIngredient r17ing9 = new RecipeIngredient(10, 17, 360.0, "g");
			RecipeIngredient r17ing10 = new RecipeIngredient(29, 17, 1.0, "tbsp");
			RecipeIngredient r17ing11 = new RecipeIngredient(30, 17, 1.0, "tbsp");
			RecipeIngredient r17ing12 = new RecipeIngredient(31, 17, 58.0, "g");
			RecipeIngredient r17ing13 = new RecipeIngredient(21, 17, 2.0, "tbsp");
			RecipeIngredient r17ing14 = new RecipeIngredient(32, 17, 125.0, "ml");
			
			
			//RECIPE ID - 18
			RecipeIngredient r18ing1 = new RecipeIngredient(33, 18, 250.0, "g");
			RecipeIngredient r18ing2 = new RecipeIngredient(34, 18, 1.0, "tbsp");
			RecipeIngredient r18ing3 = new RecipeIngredient(35, 18, 2.0, "tsp");
			RecipeIngredient r18ing4 = new RecipeIngredient(77, 18, 57.0, "g");
			RecipeIngredient r18ing5 = new RecipeIngredient(83, 18, 0.25, "g");
			RecipeIngredient r18ing6 = new RecipeIngredient(36, 18, 250.0, "ml");
			RecipeIngredient r18ing7 = new RecipeIngredient(37, 18, 2.0, "tbsp");
			RecipeIngredient r18ing8 = new RecipeIngredient(1, 18, 200.0, "g");
			
			
			//RECIPE ID - 19
			RecipeIngredient r19ing1 = new RecipeIngredient(38, 19, 110.0, "g");
			RecipeIngredient r19ing2 = new RecipeIngredient(15, 19, 10.0, "g");
			RecipeIngredient r19ing3 = new RecipeIngredient(4, 19, 2.0, "tbsp");
			RecipeIngredient r19ing4 = new RecipeIngredient(39, 19, 0.5, "tsp");
			RecipeIngredient r19ing5 = new RecipeIngredient(69, 19, 0.5, "tsp");
			RecipeIngredient r19ing6 = new RecipeIngredient(40, 19, 0.5, "tsp");
			RecipeIngredient r19ing7 = new RecipeIngredient(41, 19, 150.0, "g");
			RecipeIngredient r19ing8 = new RecipeIngredient(42, 19, 210.0, "g");
			RecipeIngredient r19ing9 = new RecipeIngredient(43, 19, 400.0, "g");
			RecipeIngredient r19ing10 = new RecipeIngredient(44, 19, 480.0, "g");
			RecipeIngredient r19ing11 = new RecipeIngredient(45, 19, 400.0, "g");
			RecipeIngredient r19ing12 = new RecipeIngredient(46, 19, 250.0, "ml");
			RecipeIngredient r19ing13 = new RecipeIngredient(47, 19, 2.0, "tbsp");
			RecipeIngredient r19ing14 = new RecipeIngredient(48, 19, 35.0, "g");
			RecipeIngredient r19ing15 = new RecipeIngredient(21, 19, 56.0, "g");
			
			
			//RECIPE ID - 20
			RecipeIngredient r20ing1 = new RecipeIngredient(78, 20, 125.0, "g");
			RecipeIngredient r20ing2 = new RecipeIngredient(77, 20, 57.0, "g");
			RecipeIngredient r20ing3 = new RecipeIngredient(79, 20, 250.0, "ml");
			RecipeIngredient r20ing4 = new RecipeIngredient(81, 20, 2.0, "tbsp");
			RecipeIngredient r20ing5 = new RecipeIngredient(66, 20, 50.0, "g");
			
			
			// RECIPE ID - 21
			RecipeIngredient r21ing1 = new RecipeIngredient(63, 21, 400.0, "g");
			RecipeIngredient r21ing2 = new RecipeIngredient(80, 21, 100.0, "ml");
			RecipeIngredient r21ing3 = new RecipeIngredient(81, 21, 150.0, "ml");
			//RecipeIngredient r21ing4 = new RecipeIngredient(tahini, 21, 125.0, "g");
			RecipeIngredient r21ing5 = new RecipeIngredient(69, 21, 1.5, "tsp");
			RecipeIngredient r21ing6 = new RecipeIngredient(82, 21, 7.0, "g");
						
						
			// RECIPE ID - 22
			RecipeIngredient r22ing1 = new RecipeIngredient(78, 22, 400.0, "g");
			RecipeIngredient r22ing2 = new RecipeIngredient(83, 22, 1.0, "tsp");
			RecipeIngredient r22ing3 = new RecipeIngredient(84, 22, 7.0, "g");
			RecipeIngredient r22ing4 = new RecipeIngredient(85, 22, 284.0, "ml");
			RecipeIngredient r22ing5 = new RecipeIngredient(77, 22, 114.0, "g");
			RecipeIngredient r22ing6 = new RecipeIngredient(4, 22, 2.0, "tbsp");

			
						
			repository.saveAll(List.of(r1ing1, r1ing2, r1ing3,
					r2ing1, r2ing2, r2ing3, r2ing4, r2ing5,
					r3ing1, r3ing2, r3ing3, r3ing4, r3ing5,
					r4ing1, r4ing2, r4ing3, r4ing4, r4ing5,
					r5ing1, r5ing2, r5ing3, r5ing4, r5ing5, r5ing6, r5ing7,
					r6ing1, r6ing2, r6ing3, r6ing4, r6ing5, r6ing6, r6ing7, r6ing8, r6ing9, r6ing10, r6ing11, r6ing12, r6ing13, r6ing14, r6ing15, r6ing16,
					r7ing1, r7ing2, r7ing3, r7ing4, r7ing5, r7ing6, r7ing7, r7ing8, r7ing9, r7ing10,
					r8ing1, r8ing2, r8ing3, r8ing4, r8ing5,
					r9ing1, r9ing2, r9ing3, r9ing4, r9ing5, r9ing6, r9ing7, r9ing8, r9ing9, r9ing10, r9ing11,
					r10ing1, r10ing2, r10ing3, r10ing5, r10ing6, r10ing7, r10ing8,
					r11ing1, r11ing2, r11ing3, r11ing4, r11ing5,
					r12ing1, r12ing2, r12ing3, r12ing4, r12ing5,
					r13ing1, r13ing2, r13ing3, r13ing4, r13ing5,
					r14ing1, r14ing2, r14ing3, r14ing4, r14ing5, r14ing6,
					r15ing1, r15ing2, r15ing3, r15ing4, r15ing5, r15ing6, r15ing7, r15ing8, r15ing9,
					r16ing1, r16ing2, r16ing3, r16ing4, r16ing5, r16ing6, r16ing7, r16ing8,
					r17ing1, r17ing2, r17ing3, r17ing4, r17ing5, r17ing6, r17ing7, r17ing8, r17ing9, r17ing10, r17ing11, r17ing12, r17ing13, r17ing14,
					r18ing1, r18ing2, r18ing3, r18ing4, r18ing5, r18ing6, r18ing7, r18ing8,
					r19ing1, r19ing2, r19ing3, r19ing4, r19ing5, r19ing6, r19ing7, r19ing8, r19ing9, r19ing10, r19ing11, r19ing12, r19ing13, r19ing14, r19ing15,
					r20ing1, r20ing2, r20ing3, r20ing4, r20ing5,
					r21ing1, r21ing2, r21ing3, r21ing5, r21ing6,
					r22ing1, r22ing2, r22ing3, r22ing4, r22ing5, r22ing6));
		};
	}
}
