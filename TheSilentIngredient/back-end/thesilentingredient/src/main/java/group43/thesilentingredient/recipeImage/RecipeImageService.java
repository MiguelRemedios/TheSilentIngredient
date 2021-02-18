package group43.thesilentingredient.recipeImage;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class RecipeImageService {

	private final RecipeImageRepository recipeimgRepository;

	@Autowired
	public RecipeImageService(RecipeImageRepository recipeimgRepository) {
		this.recipeimgRepository = recipeimgRepository;
	}


	public List<RecipeImage> getRecipeImages() {
		return recipeimgRepository.findAll();
	}

	public Optional<RecipeImage> retrieveRecipeImage(Long recipeImageId) {
		return recipeimgRepository.findById(recipeImageId);
	}

	public List<RecipeImage> retrieveRecipeImages(Integer recipeNr) {
		return recipeimgRepository.findIngredientsByRecipeNr(recipeNr);
	}

	public void addNewRecipeImage(RecipeImage recipeImage) {
		Optional<RecipeImage> recipeimgOptional = recipeimgRepository.findRecipeImageByNr(recipeImage.getRecipeNr());

		if (recipeimgOptional.isPresent()) {
			throw new IllegalStateException("Recipe Image taken!");
		}

		recipeimgRepository.save(recipeImage);
	}


	public void deleteRecipeImage(Long recipeImageId) {

		boolean exists = recipeimgRepository.existsById(recipeImageId);

		if(!exists) {
			throw new IllegalStateException("Recipe Image with ID " + recipeImageId + " does not exist!");
		}

		recipeimgRepository.deleteById(recipeImageId);
	}

	@Transactional
	public void updateRecipeImage(Long recipeImageId, Integer recipeNr, String path) {
		RecipeImage recipeImg = recipeimgRepository.findById(recipeImageId)
				.orElseThrow(() -> new IllegalStateException("Recipe Image with ID " + 
						recipeImageId + 
						" does not exist!"));

		if (recipeNr != 0 &&
				recipeNr > 0 &&
				!Objects.equals(recipeImg.getRecipeNr(), recipeNr)) { //If the name is not the same as the current
			
			Optional<RecipeImage> recipeimgOptional = recipeimgRepository.findRecipeImageByNr(recipeNr);
			
			if (recipeimgOptional.isPresent()) {
				throw new IllegalStateException("Recipe Image taken!");
			}
			recipeImg.setRecipeNr(recipeNr);
		}

		if (path != null &&
				path.length() > 0 &&
				!Objects.equals(recipeImg.getPath(), path)) { //If the name is not the same as the current

			Optional<RecipeImage> recipeimgOptional = recipeimgRepository.findRecipeImageByPath(path);

			if (recipeimgOptional.isPresent()) {
				throw new IllegalStateException("Recipe Image path taken!");
			}
			recipeImg.setPath(path);
		}
		
	}

}
