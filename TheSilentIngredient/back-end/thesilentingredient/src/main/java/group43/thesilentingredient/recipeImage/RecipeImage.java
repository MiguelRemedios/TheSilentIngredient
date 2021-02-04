package group43.thesilentingredient.recipeImage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "RecipeImage")
@Table(name = "recipe_image")
public class RecipeImage {

	@Id
	@SequenceGenerator(
			name = "recipeimage_sequence",
			sequenceName = "recipeimage_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "recipeimage_sequence"
			)
	
	@Column(name = "id", updatable = false)
	private Long id;
	
	@Column(name = "recipeNr", nullable = false)
	private int recipeId;
	
	@Column(name = "path", nullable = false)
	private String path;
	
	public RecipeImage() {
	}

	public RecipeImage(Long id, int recipeId, String path) {
		this.id = id;
		this.recipeId = recipeId;
		this.path = path;
	}
	
	public RecipeImage(int recipeId, String path) {
		this.recipeId = recipeId;
		this.path = path;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeNr) {
		this.recipeId = recipeNr;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String toString() {
		return "Recipe{" +
				"id=" + id + 
				", recipe id='" + recipeId +
				", description='" + path + "'}";
	}
	
	
}
