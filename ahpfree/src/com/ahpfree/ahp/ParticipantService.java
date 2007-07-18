package com.ahpfree.ahp;

import java.util.Collection;

import com.ahpfree.ahp.model.Participant;

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
	 * Retrieve a Participant by name.
	 * @param participantName to retrieve.
	 * @return the Participant instance.
	 */
	Participant getParticipant(String participantName);

	/**
	 * Retrieve a Participant by Id.
	 * @param participantId to retrieve.
	 * @return the Participant instance.
	 */
	Participant getParticipant(Integer participantId);

	/**
	 * Retrieve all Participants.
	 * @return a collection of all Participant instances.
	 */
	Collection<Participant> getAllParticipants();

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
