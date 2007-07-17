/**
 *
 */
package com.ahpfree.ahp.model;

import java.util.HashMap;

import com.ahpfree.ahp.model.interfaces.Cluster;
import com.ahpfree.ahp.model.interfaces.Criterion;
import com.ahpfree.ahp.model.interfaces.Participant;
import com.ahpfree.ahp.model.interfaces.Vote;

/**
 * A cluster is a comparison set within a decision hierarchy.
 */
public class ClusterImpl implements Cluster {
    /**
     * The parent criterion for this cluster.  If
     * this is the goal cluster, it should be null.
     */
    private Criterion withRespectToCriterion;

    /**
     * The unique identifier of the cluster.
     */
    private Integer clusterId;

    /**
     * The collection of criteria in the cluster.
     */
    private HashMap<Integer, Criterion> clusterCriteria;

    /**
     * The collection of criteria comparison votes for this cluster.
     */
    private HashMap<Participant, Vote> clusterParticipantComparisonVotes;

    /**
     * ClusterImpl Constructor.
     */
    public ClusterImpl()
    {
    }

    /**
     * @return Returns the clusterParticipantComparisonVotes.
     */
    public HashMap<Participant, Vote> getClusterParticipantComparisonVotes()
    {
        return clusterParticipantComparisonVotes;
    }

    /**
     * @param clusterParticipantComparisonVotes The clusterParticipantComparisonVotes to set.
     */
    public void setClusterParticipantComparisonVotes(HashMap<Participant, Vote> clusterParticipantComparisonVotes)
    {
        this.clusterParticipantComparisonVotes = clusterParticipantComparisonVotes;
    }

    /**
     * @return Returns the clusterCriteria.
     */
    public HashMap<Integer, Criterion> getClusterCriteria()
    {
        return clusterCriteria;
    }

    /**
     * @param clusterCriteria The clusterCriteria to set.
     */
    public void setClusterCriteria(HashMap<Integer, Criterion> clusterCriteria)
    {
        this.clusterCriteria = clusterCriteria;
    }

    /**
     * @return Returns the clusterId.
     */
    public Integer getClusterId()
    {
        return clusterId;
    }

    /**
     * @param clusterId The clusterId to set.
     */
    public void setClusterId(Integer clusterId)
    {
        this.clusterId = clusterId;
    }

    /**
     * @return Returns the withRespectToCriterion.
     */
    public Criterion getWithRespectToCriterion()
    {
        return withRespectToCriterion;
    }

    /**
     * @param withRespectToCriterion The withRespectToCriterion to set.
     */
    public void setWithRespectToCriterion(Criterion withRespectToCriterion)
    {
        this.withRespectToCriterion = withRespectToCriterion;
    }
}
