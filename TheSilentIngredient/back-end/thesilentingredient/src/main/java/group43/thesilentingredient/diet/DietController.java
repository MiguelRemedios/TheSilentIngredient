package group43.thesilentingredient.diet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "api/v1/diet")
@CrossOrigin(origins = "*")

public class DietController {

	private final DietService dietService;
	

	@Autowired
	public DietController(DietService dietService) {
		this.dietService = dietService;
	}

	@GetMapping
	public List<Diet> getDiet() {
		return dietService.getDiet();
	}
	
	@GetMapping(path = "{id}")
    public Optional<Diet> retrieveDiet(@PathVariable("id") Long dietId){
        return dietService.retrieveDiet(dietId);
    }

	@PostMapping
	public void registerDiet(@RequestBody Diet diet) {
		dietService.addNewDiet(diet);
	}

	@DeleteMapping(path = "{dietId}")
	public void deleteDiet(@PathVariable("dietId") Long dietId) {
		dietService.deleteDiet(dietId);
	}

	@PutMapping(path = "{dietId}")
	public void updateDiet(@PathVariable("dietId") Long dietId, 
			@RequestParam(required = false) String dietName,
			@RequestParam(required = false) String dietDesc) {
		dietService.updateDiet(dietId, dietName, dietDesc);
	}
}