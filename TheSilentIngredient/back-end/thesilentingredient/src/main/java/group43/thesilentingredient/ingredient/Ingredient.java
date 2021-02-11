package group43.thesilentingredient.ingredient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
  
@Entity(name = "Ingredient")
@Table(name = "ingredient")
public class Ingredient {

	@Id
	@SequenceGenerator(
			name = "ingredient_sequence",
			sequenceName = "ingredient_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "ingredient_sequence"
			)
	
	private Long id;
	private String name;
	private Double calories;
	private Double protein;
	private Double carbohydrate;
	private Double fat;
	
	public Ingredient() {
	}

	public Ingredient(Long id, String name, double calories, double protein, double carbohydrate, double fat) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.fat = fat;
	}
	
	public Ingredient(String name, double calories, double protein, double carbohydrate, double fat) {
		this.name = name;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.fat = fat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}
	public double getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}
	
	public String toString() {
		return "Ingredient{" +
				"id=" + id + 
				", name='" + name +
				", calories='" + calories +
				", protein='"+ protein +
				", carbohydrate='"+carbohydrate +
				", fat='"+fat+"'}";
	}
}
