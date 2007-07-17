package com.ahpfree.ahp;

import java.util.Collection;

import com.ahpfree.ahp.model.interfaces.Alternative;
import com.ahpfree.ahp.model.interfaces.Criterion;

/**
 * Service class to provide access to Criterion instances.
 */
public interface CriterionService {
	/**
	 * Create a new instance of an Criterion.
	 * @return a new instance of an Criterion.
	 */
	Alternative createNewCriterion();

	/**
	 * Retrieve an Criterion.
	 * @param criterionName to retrieve.
	 * @return the Criterion instance.
	 */
	Criterion getCriterion(String criterionName);

	/**
	 * Retrieve an Criterion.
	 * @param criterionId to retrieve.
	 * @return the Criterion instance.
	 */
	Criterion getCriterion(Integer criterionId);

	/**
	 * Retrieve all Criteria.
	 * @return all Criterion instances.
	 */
	Collection<Criterion> getAllCriteria();

	/**
	 * Add an Criterion.
	 * @param criterion to add.
	 */
	void addCriterion(Criterion criterion);

	/**
	 * Update an Criterion.
	 * @param criterion to update.
	 */
	void updateCriterion(Criterion criterion);

	/**
	 * Delete an Criterion.
	 * @param criterion to delete.
	 */
	void deleteCriterion(Criterion criterion);
}
