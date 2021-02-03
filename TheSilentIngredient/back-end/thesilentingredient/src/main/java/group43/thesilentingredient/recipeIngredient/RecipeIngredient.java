package group43.thesilentingredient.recipeIngredient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "RecipeIngredient")
@Table(name = "recipe_ingredient")
public class RecipeIngredient{
	
	@Id
	@SequenceGenerator(
			name="recipe_ingredient_sequence",
			sequenceName = "recipe_ingredient_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "recipe_ingredient_sequence"
			)	
	
	@Column(name = "id", updatable = false)
	private Long id;
	@Column(name = "ingredient_id", updatable = false)
	private int ingredient_id;
	@Column(name = "recipe_id", updatable = false)
	private int recipe_id;
	@Column(name = "quantity", nullable = false)
	private double quantity;
	@Column(name = "measurement", nullable = false)
	private String measurement;
	
	public RecipeIngredient() {
	}
	
	public RecipeIngredient(Long id, int ingredient_id, int recipe_id, double quantity, String measurement) {
		this.id = id;
		this.ingredient_id = ingredient_id;
		this.recipe_id = recipe_id;
		this.quantity = quantity;
		this.measurement = measurement;
	}
	
	public RecipeIngredient(int ingredient_id, int recipe_id, double quantity, String measurement) {
		this.ingredient_id = ingredient_id;
		this.recipe_id = recipe_id;
		this.quantity = quantity;
		this.measurement = measurement;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getIngredient_id() {
		return ingredient_id;
	}

	public void setIngredient_id(int ingredient_id) {
		this.ingredient_id = ingredient_id;
	}

	public int getRecipe_id() {
		return recipe_id;
	}

	public void setRecipe_id(int recipe_id) {
		this.recipe_id = recipe_id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
	
	public String toString() {
		return "RecipeIngredient{" +
				"ingredient_id=" + ingredient_id + 
				", recipe_id='" + recipe_id +
				", quantity='" + quantity +
				", measurement='" + measurement + "'}";
	}
	
	
}
