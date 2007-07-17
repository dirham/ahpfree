package com.ahpfree.ahp;

import com.ahpfree.ahp.model.interfaces.Cluster;

/**
 * Service class to provide access to Cluster instances.
 */
public interface ClusterService {
	/**
	 * Create a new instance of a Cluster.
	 * @return a new instance of a Cluster.
	 */
	Cluster createNewCluster();

	/**
	 * Retrieve an Cluster.
	 * @param clusterName to retrieve.
	 * @return the Cluster instance.
	 */
	Cluster getCluster(String clusterName);

	/**
	 * Add an Cluster.
	 * @param cluster to add.
	 */
	void addCluster(Cluster cluster);

	/**
	 * Update an Cluster.
	 * @param alternative to update.
	 */
	void updateCluster(Cluster cluster);

	/**
	 * Delete an Cluster.
	 * @param cluster to delete.
	 */
	void deleteCluster(Cluster cluster);
}
