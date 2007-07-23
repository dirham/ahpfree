package com.ahpfree.ahp;

import com.ahpfree.ahp.model.ModelComment;

/**
 * Service class to provide access to Model Comment instances.
 */
public interface ModelCommentService {
	/**
	 * Create a new instance of an Model comment.
	 * @return a new instance of an Model comment.
	 */
	ModelComment createNewModelComment();

	/**
	 * Retrieve a ModelComment by participant name.
	 * @param parentObject to which the ModelComment belongs.
	 * @param pariticpantName by which to retrieve the ModelComment.
	 * @return the ModelComment instance.
	 */
	ModelComment getModelCommentByParticipant(Object parentObject, String participantName);

	/**
	 * Retrieve a ModelComment by participant Id.
	 * @param parentObject to which the ModelComment belongs.
	 * @param participantId by which to retrieve the ModelComment.
	 * @return the ModelComment instance.
	 */
	ModelComment getModelComment(Object parentObject, Integer participantId);

	/**
	 * Update an ModelComment.
	 * @param modelComment to update.
	 */
	void updateModelComment(ModelComment modelComment);

	/**
	 * Delete an ModelComment.
	 * @param modelComment to delete.
	 */
	void deleteModelComment(ModelComment modelComment);
}
