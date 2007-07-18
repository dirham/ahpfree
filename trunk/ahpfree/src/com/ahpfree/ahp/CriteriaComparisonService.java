package com.ahpfree.ahp;

import java.util.Collection;

import com.ahpfree.ahp.model.Alternative;
import com.ahpfree.ahp.model.CriteriaComparison;
import com.ahpfree.ahp.model.Criterion;

/**
 * Service class to provide access to CriteriaComparison instances.
 */
public interface CriteriaComparisonService {
	/**
	 * Create a new instance of an CriteriaComparison.
	 * @return a new instance of an CriteriaComparison.
	 */
	Alternative createNewCriteriaComparison();

	/**
	 * Retrieve an CriteriaComparison.
	 * @param dominantCriterion in the comparison.
	 * @param passiveCriterion in the comparison.
	 * @return the CriteriaComparison instance.
	 */
	CriteriaComparison getCriteriaComparison(Criterion dominantCriterion, Criterion passiveCriterion);

	/**
	 * Retrieve an CriteriaComparison.
	 * @param comparisonId of the comparison.
	 * @return the CriteriaComparison instance.
	 */
	CriteriaComparison getCriteriaComparison(Integer comparisonId);

	/**
	 * Retrieve all CriteriaComparisons.
	 * @return a collection of all CriteriaComparison instances.
	 */
	Collection<CriteriaComparison> getAllCriteriaComparisons();

	/**
	 * Retrieve the next CriteriaComparison in sequence.
	 * @param dominantCriterion in the comparison.
	 * @param passiveCriterion in the comparison.
	 * @return the CriteriaComparison instance.
	 */
	CriteriaComparison getNextCriteriaComparison(Criterion dominantCriterion, Criterion passiveCriterion);

	/**
	 * Add an CriteriaComparison.
	 * @param criteriaComparison to add.
	 */
	void addCriteriaComparison(CriteriaComparison criteriaComparison);

	/**
	 * Update an CriteriaComparison.
	 * @param criteriaComparison to update.
	 */
	void updateCriteriaComparison(CriteriaComparison criteriaComparison);

	/**
	 * Delete an CriteriaComparison.
	 * @param criteriaComparison to delete.
	 */
	void deleteCriteriaComparison(CriteriaComparison criteriaComparison);
}
