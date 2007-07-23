package com.ahpfree.ahp;

import java.util.Collection;

import com.ahpfree.ahp.model.Rating;
import com.ahpfree.ahp.model.RatingScale;

/**
 * Service class to provide access to Rating Scale instances.
 */
public interface RatingScaleService {
	/**
	 * Create a new instance of a RatingScale.
	 * @return a new instance of a RatingScale.
	 */
	Rating createNewRatingScale();

	/**
	 * Retrieve a RatingScale by name.
	 * @param ratingScaleName to retrieve.
	 * @return the RatingScale instance.
	 */
	RatingScale getRatingScale(String ratingScaleName);

	/**
	 * Retrieve a RatingScale by Id.
	 * @param ratingScaleId to retrieve.
	 * @return the RatingScale instance.
	 */
	RatingScale getRatingScale(Integer ratingScaleId);

	/**
	 * Retrieve all RatingScale instances.
	 * @param rating for which the rating scales are to be retrieved.
	 * @return a collection of all RatingScale instances.
	 */
	Collection<RatingScale> getAllRatingScales(Rating rating);

	/**
	 * Add a RatingScale.
	 * @param ratingScale to add.
	 */
	void addRatingScale(RatingScale ratingScale);

	/**
	 * Update a RatingScale.
	 * @param ratingScale to update.
	 */
	void updateRatingScale(RatingScale ratingScale);

	/**
	 * Delete a RatingScale.
	 * @param ratingScale to delete.
	 */
	void deleteRatingScale(RatingScale ratingScale);
}
