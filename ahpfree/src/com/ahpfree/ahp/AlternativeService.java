package com.ahpfree.ahp;

import java.util.Collection;

import com.ahpfree.ahp.model.Alternative;

/**
 * Service class to provide access to Alternative instances.
 */
public interface AlternativeService {
	/**
	 * Create a new instance of an Alternative.
	 * @return a new instance of an Alternative.
	 */
	Alternative createNewAlternative();

	/**
	 * Retrieve an Alternative.
	 * @param alternativeName to retrieve.
	 * @return the Alternative instance.
	 */
	Alternative getAlternative(String alternativeName);

	/**
	 * Retrieve an Alternative.
	 * @param alternativeId to retrieve.
	 * @return the Alternative instance.
	 */
	Alternative getAlternative(Integer alternativeId);

	/**
	 * Retrieve a collection of all Alternatives.
	 * @return all Alternative instances.
	 */
	Collection<Alternative> getAllAlternatives();

	/**
	 * Add an Alternative.
	 * @param alternative to add.
	 */
	void addAlternative(Alternative alternative);

	/**
	 * Update an Alternative.
	 * @param alternative to update.
	 */
	void updateAlternative(Alternative alternative);

	/**
	 * Delete an Alternative.
	 * @param alternative to delete.
	 */
	void deleteAlternative(Alternative alternative);
}
