package group43.thesilentingredient.recipe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "Recipe")
@Table(name = "recipe", uniqueConstraints = {@UniqueConstraint(name = "recipe_name_unique", columnNames = "name")})
public class Recipe {

	@Id
	@SequenceGenerator(
			name = "recipe_sequence",
			sequenceName = "recipe_sequence",
			allocationSize = 1
			)

	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "recipe_sequence"
			)

	@Column(name = "id", updatable = false)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "serving", nullable = false)
	private Integer serving;
	
	@Column(name = "cooktime", nullable = false)
	private String cooktime;
	
	
	public Recipe() {
	}

	public Recipe(Long id, String name, String description, int serving, String cooktime) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.serving = serving;
		this.cooktime = cooktime;
	}
	
	public Recipe(String name, String description, int serving, String cooktime) {
		this.name = name;
		this.description = description;
		this.serving = serving;
		this.cooktime = cooktime;
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

	public int getServing() {
		return serving;
	}

	public void setServing(int serving) {
		this.serving = serving;
	}

	public String getCooktime() {
		return cooktime;
	}

	public void setCooktime(String cooktime) {
		this.cooktime = cooktime;
	}

	public String toString() {
		return "Recipe {" +
				"id=" + id + 
				", name='" + name +
				", description='" + description +
				", serving(s)='" + serving + 
				". cookingtime='" + cooktime +  "'}";
	}
	
	
}
