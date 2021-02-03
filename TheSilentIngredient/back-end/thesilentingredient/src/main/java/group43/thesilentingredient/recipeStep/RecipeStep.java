package group43.thesilentingredient.recipeStep;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="RecipeStep")
@Table(name="recipe_step")
public class RecipeStep {
	
	@Id
	@SequenceGenerator(
			name="recipe_step_sequence",
			sequenceName = "recipe_step_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "recipe_step_sequence"
			)
	
	@Column(name="id", updatable=false)
	private Long id;
	@Column(name = "step_id", updatable = false)
	private Integer step_id;
	@Column(name = "recipe_id", nullable = false)
	private Integer recipe_id;
	@Column(name = "step", nullable = false)
	private String step;
	
	public RecipeStep() {
	}

	public RecipeStep(Long id, Integer step_id, Integer recipe_id, String step) {
		this.id = id;
		this.step_id = step_id;
		this.recipe_id = recipe_id;
		this.step = step;
	}

	public RecipeStep(Integer step_id, Integer recipe_id, String step) {
		this.step_id = step_id;
		this.recipe_id = recipe_id;
		this.step = step;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStep_id() {
		return step_id;
	}

	public void setStep_id(Integer step_id) {
		this.step_id = step_id;
	}

	public Integer getRecipe_id() {
		return recipe_id;
	}

	public void setRecipe_id(Integer recipe_id) {
		this.recipe_id = recipe_id;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String toString() {
		return "RecipeStep [id=" + id + ", step_id=" + step_id + ", recipe_id=" + recipe_id + ", step=" + step + "]";
	}
		
}
