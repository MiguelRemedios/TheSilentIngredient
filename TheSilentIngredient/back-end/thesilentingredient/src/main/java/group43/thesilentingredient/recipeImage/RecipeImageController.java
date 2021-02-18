package group43.thesilentingredient.recipeImage;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "api/v1/recipe-image")
@CrossOrigin(origins = "*")

public class RecipeImageController {

	private final RecipeImageService recipeImageService;

	@Autowired
	public RecipeImageController(RecipeImageService recipeImageService) {
		this.recipeImageService = recipeImageService;
	}

	@GetMapping
	public List<RecipeImage> getRecipeImages() {
		return recipeImageService.getRecipeImages();		
	}
	
	@GetMapping(path = "{id}")
	public Optional<RecipeImage> retrieveRecipeImage(@PathVariable("id") Long recipeImageId){
		return recipeImageService.retrieveRecipeImage(recipeImageId);
	}
	
	@GetMapping(path = "/nr/{recipeNr}")
	public List<RecipeImage> retrieveRecipeImages(@PathVariable("recipeNr") Integer recipeNr){
		return recipeImageService.retrieveRecipeImages(recipeNr);
	}

	@PostMapping
	public void registerRecipeImage(@RequestBody RecipeImage recipeImage) {
		recipeImageService.addNewRecipeImage(recipeImage);
	}

	@DeleteMapping(path = "{recipeImageId}")
	public void deleteRecipeImage(@PathVariable("recipeImageId") Long recipeImageId) {
		recipeImageService.deleteRecipeImage(recipeImageId);
	}

	@PutMapping(path = "{recipeImageId}")
	public void updateRecipeImage(@PathVariable("recipeImageId") Long recipeImageId,
			@RequestParam(required = false) int recipeNr,
			@RequestParam(required = false) String path) {
		recipeImageService.updateRecipeImage(recipeImageId, recipeNr, path);
	}
}
