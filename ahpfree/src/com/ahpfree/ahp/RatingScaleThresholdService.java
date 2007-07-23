package com.ahpfree.ahp;

import java.util.Collection;

import com.ahpfree.ahp.model.Rating;
import com.ahpfree.ahp.model.RatingScale;
import com.ahpfree.ahp.model.RatingScaleThreshold;

/**
 * Service class to provide access to Rating Scale Threshold instances.
 */
public interface RatingScaleThresholdService {
	/**
	 * Create a new instance of a RatingScaleThreshold.
	 * @return a new instance of a RatingScaleThreshold.
	 */
	Rating createNewRatingScaleThreshold();

	/**
	 * Retrieve a RatingScaleThreshold by name.
	 * @param ratingScaleThresholdName to retrieve.
	 * @return the RatingScaleThreshold instance.
	 */
	RatingScaleThreshold getRatingScaleThreshold(String ratingScaleThresholdName);

	/**
	 * Retrieve a RatingScaleThreshold by Id.
	 * @param ratingScaleThresholdId to retrieve.
	 * @return the RatingScaleThreshold instance.
	 */
	RatingScaleThreshold getRatingScaleThreshold(Integer ratingScaleThresholdId);

	/**
	 * Retrieve all RatingScaleThreshold instances.
	 * @param ratingScale for which the rating scale thresholds are to be retrieved.
	 * @return a collection of all RatingScaleThreshold instances.
	 */
	Collection<RatingScaleThreshold> getAllRatingScaleThresholds(RatingScale ratingScale);

	/**
	 * Add a RatingScaleThreshold.
	 * @param ratingScaleThreshold to add.
	 */
	void addRatingScaleThreshold(RatingScaleThreshold ratingScaleThreshold);

	/**
	 * Update a RatingScaleThreshold.
	 * @param ratingScaleThreshold to update.
	 */
	void updateRatingScaleThreshold(RatingScaleThreshold ratingScaleThreshold);

	/**
	 * Delete a RatingScaleThreshold.
	 * @param ratingScaleThreshold to delete.
	 */
	void deleteRatingScaleThreshold(RatingScaleThreshold ratingScaleThreshold);
}
