package com.ahpfree.ahp;

import java.util.Collection;

import com.ahpfree.ahp.model.Model;
import com.ahpfree.ahp.model.Rating;

/**
 * Service class to provide access to Rating instances.
 */
public interface RatingService {
	/**
	 * Create a new instance of an Rating.
	 * @return a new instance of an Rating.
	 */
	Rating createNewRating();

	/**
	 * Retrieve a Rating by name.
	 * @param ratingName to retrieve.
	 * @return the Rating instance.
	 */
	Rating getRating(String ratingName);

	/**
	 * Retrieve a Rating by Id.
	 * @param ratingId to retrieve.
	 * @return the Rating instance.
	 */
	Rating getRating(Integer ratingId);

	/**
	 * Retrieve all Ratings.
	 * @param model for which the ratings are to be retrieved.
	 * @return a collection of all Rating instances.
	 */
	Collection<Rating> getAllRatings(Model model);

	/**
	 * Add an Rating.
	 * @param rating to add.
	 */
	void addRating(Rating rating);

	/**
	 * Update an Rating.
	 * @param rating to update.
	 */
	void updateRating(Rating rating);

	/**
	 * Delete an Rating.
	 * @param rating to delete.
	 */
	void deleteRating(Rating rating);
}
