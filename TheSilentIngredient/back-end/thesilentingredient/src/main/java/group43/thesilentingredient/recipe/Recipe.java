package group43.thesilentingredient.recipe;

public class Recipe {

	private Long id;
	private String name;
	private String description;
	
	public Recipe() {
	}

	public Recipe(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Recipe(String name, String description) {
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return "Recipe{" +
				"id=" + id + 
				", name='" + name +
				", description='" + description;
	}
	
	
}
