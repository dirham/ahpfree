package com.ahpfree.ahp;

import com.ahpfree.ahp.model.interfaces.Participant;

/**
 * Service class to provide access to Participant instances.
 */
public interface ParticipantService {
	/**
	 * Create a new instance of an Participant.
	 * @return a new instance of an Participant.
	 */
	Participant createNewParticipant();

	/**
	 * Retrieve an Participant.
	 * @param participantName to retrieve.
	 * @return the Participant instance.
	 */
	Participant getParticipant(String participantName);

	/**
	 * Add an Participant.
	 * @param participant to add.
	 */
	void addParticipant(Participant participant);

	/**
	 * Update an Participant.
	 * @param participant to update.
	 */
	void updateParticipant(Participant participant);

	/**
	 * Delete an Participant.
	 * @param participant to delete.
	 */
	void deleteParticipant(Participant participant);
}
