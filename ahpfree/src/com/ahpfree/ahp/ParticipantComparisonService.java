package com.ahpfree.ahp;

import java.util.Collection;

import com.ahpfree.ahp.model.Alternative;
import com.ahpfree.ahp.model.Participant;
import com.ahpfree.ahp.model.ParticipantComparison;

/**
 * Service class to provide access to ParticipantComparison instances.
 */
public interface ParticipantComparisonService {
	/**
	 * Create a new instance of an ParticipantComparison.
	 * @return a new instance of an ParticipantComparison.
	 */
	Alternative createNewParticipantComparison();

	/**
	 * Retrieve an ParticipantComparison.
	 * @param dominantParticipant in the comparison.
	 * @param passiveParticipant in the comparison.
	 * @return the ParticipantComparison instance.
	 */
	ParticipantComparison getParticipantComparison(
			Participant dominantParticipant, Participant passiveParticipant);

	/**
	 * Retrieve an ParticipantComparison.
	 * @param comparisonId of the comparison.
	 * @return the ParticipantComparison instance.
	 */
	ParticipantComparison getParticipantComparison(Integer comparisonId);

	/**
	 * Retrieve all ParticipantComparisons.
	 * @return a collection of all ParticipantComparison instances.
	 */
	Collection<ParticipantComparison> getAllParticipantComparisons();

	/**
	 * Retrieve the next ParticipantComparison in sequence.
	 * @param dominantParticipant in the comparison.
	 * @param passiveParticipant in the comparison.
	 * @return the ParticipantComparison instance.
	 */
	ParticipantComparison getNextParticipantComparison(
			Participant dominantParticipant, Participant passiveParticipant);

	/**
	 * Add an ParticipantComparison.
	 * @param participantComparison to add.
	 */
	void addParticipantComparison(ParticipantComparison participantComparison);

	/**
	 * Update an ParticipantComparison.
	 * @param participantComparison to update.
	 */
	void updateParticipantComparison(ParticipantComparison participantComparison);

	/**
	 * Delete an ParticipantComparison.
	 * @param participantComparison to delete.
	 */
	void deleteParticipantComparison(ParticipantComparison participantComparison);
}
