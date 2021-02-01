package group43.thesilentingredient.diet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Diet {

	@Id
	@SequenceGenerator(name = "diet_sequence", sequenceName = "diet_sequence", allocationSize = 1)

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diet_sequence")

	private Long id;
	private String name;
	private String description;

	public Diet() {
	}

	public Diet(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Diet(String name, String description) {
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
		return "Diet{" + "id=" + id + ", name='" + name + ", description='" + description + "'}";
	}

}
