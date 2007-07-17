package com.ahpfree.ahp;

import java.util.Collection;

import com.ahpfree.ahp.model.interfaces.Alternative;
import com.ahpfree.ahp.model.interfaces.AlternativeComparison;
import com.ahpfree.ahp.model.interfaces.Criterion;

/**
 * Service class to provide access to AlternativeComparison instances.
 */
public interface AlternativeComparisonService {
	/**
	 * Create a new instance of an AlternativeComparison.
	 * @return a new instance of an AlternativeComparison.
	 */
	AlternativeComparison createNewAlternativeComparison();

	/**
	 * Retrieve an AlternativeComparison.
	 * @param dominantCriterion in the comparison.
	 * @param passiveCriterion in the comparison.
	 * @param alternative in the comparison.
	 * @return the AlternativeComparison instance.
	 */
	AlternativeComparison getAlternativeComparison(Criterion dominantCriterion, Criterion passiveCriterion, Alternative alternative);

	/**
	 * Retrieve the next AlternativeComparison in sequence.
	 * @param dominantCriterion in the comparison.
	 * @param passiveCriterion in the comparison.
	 * @param alternative in the comparison.
	 * @return the AlternativeComparison instance.
	 */
	AlternativeComparison getNextAlternativeComparison(Criterion dominantCriterion, Criterion passiveCriterion, Alternative alternative);

	/**
	 * Retrieve all AlternativeComparisons.
	 * @return a collection of all AlternativeComparison instances.
	 */
	Collection<AlternativeComparison> getAllAlternativeComparisons();

	/**
	 * Add an AlternativeComparison.
	 * @param alternativeComparison to add.
	 */
	void addAlternativeComparison(AlternativeComparison alternativeComparison);

	/**
	 * Update an AlternativeComparison.
	 * @param alternativeComparison to update.
	 */
	void updateAlternativeComparison(AlternativeComparison alternativeComparison);

	/**
	 * Delete an AlternativeComparison.
	 * @param alternativeComparison to delete.
	 */
	void deleteAlternativeComparison(AlternativeComparison alternativeComparison);
}
