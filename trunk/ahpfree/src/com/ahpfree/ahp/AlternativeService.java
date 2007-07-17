package com.ahpfree.ahp;

import com.ahpfree.ahp.model.interfaces.Alternative;

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
