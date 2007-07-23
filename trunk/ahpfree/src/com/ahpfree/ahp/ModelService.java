package com.ahpfree.ahp;

import java.util.Collection;

import com.ahpfree.ahp.model.Model;

/**
 * Service class to provide access to Model instances.
 */
public interface ModelService {
	/**
	 * Create a new instance of an Model.
	 * @return a new instance of an Model.
	 */
	Model createNewModel();

	/**
	 * Retrieve a Model by name.
	 * @param modelName to retrieve.
	 * @return the Model instance.
	 */
	Model getModel(String modelName);

	/**
	 * Retrieve a Model by Id.
	 * @param modelId to retrieve.
	 * @return the Model instance.
	 */
	Model getModel(Integer modelId);

	/**
	 * Retrieve all Models.
	 * @return a collection of all Model instances.
	 */
	Collection<Model> getAllModels();

	/**
	 * Add an Model.
	 * @param model to add.
	 */
	void addModel(Model model);

	/**
	 * Update an Model.
	 * @param model to update.
	 */
	void updateModel(Model model);

	/**
	 * Delete an Model.
	 * @param model to delete.
	 */
	void deleteModel(Model model);
}
