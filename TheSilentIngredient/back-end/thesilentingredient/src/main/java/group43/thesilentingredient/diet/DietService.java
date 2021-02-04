package group43.thesilentingredient.diet;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DietService {
//adding the logic to the controller class, interconnected classes make changes in both.

	private final DietRepository dietRepository;

	@Autowired
	public DietService(DietRepository dietRepository) {
		this.dietRepository = dietRepository;
	}

	public List<Diet> getDiet() {
		return dietRepository.findAll();
	}
	
	public Optional<Diet> retrieveDiet(Long dietId) {
        return dietRepository.findById(dietId);
    }

	public void addNewDiet(Diet diet) {
		Optional<Diet> recipeOptional = dietRepository.findDietByName(diet.getName());

		if (recipeOptional.isPresent()) {
			throw new IllegalStateException("Diet taken!");
		}

		dietRepository.save(diet);
	}

	public void deleteDiet(Long dietId) {

		boolean exists = dietRepository.existsById(dietId);

		if (!exists) {
			throw new IllegalStateException("Recipe with ID " + dietId + " does not exist!");
		}

		dietRepository.deleteById(dietId);
	}

	@Transactional
	void updateDiet(Long dietId, String dietName, String dietDesc) {
		Diet diet = dietRepository.findById(dietId)
				.orElseThrow(() -> new IllegalStateException("Recipe with ID " + dietId + " does not exist!"));

		if (dietName != null && dietName.length() > 0 && !Objects.equals(diet.getName(), dietName)) { // If the name is not the same as the current *post mapping*
																									

			Optional<Diet> dietOptional = dietRepository.findDietByName(dietName);

			if (dietOptional.isPresent()) {
				throw new IllegalStateException("Diet taken!");
			}
			diet.setName(dietName);
		}

		if (dietDesc != null && dietDesc.length() > 0 && !Objects.equals(diet.getDescription(), dietDesc)) { // If the name is not the same as the current
																												
			Optional<Diet> dietOptional = dietRepository.findDietByName(dietDesc);

			if (dietOptional.isPresent()) {
				throw new IllegalStateException("Recipe description taken!");
			}
			diet.setDescription(dietDesc);
		}
	}
}
