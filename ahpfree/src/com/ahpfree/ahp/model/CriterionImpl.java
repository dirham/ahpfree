/**
 *
 */
package com.ahpfree.ahp.model;

import java.util.HashMap;
import java.util.List;

/**
 * A criterion is a strategic or tactical factor in the decision to be made.
 */
public class CriterionImpl implements Criterion {
    /**
     * Unique identifier of the criterion.
     */
    private Integer criterionId;

    /**
     * Unique identifier of the cluster in which this criterion exists.
     */
    private Integer clusterId;

    /**
     * Name of the participant.
     */
    private String criterionName;

    /**
     * Participant-defined comments about this criterion.
     */
    private List<ModelComment> criterionComments;

    /**
     * Collection of criteron comparison vote data.
     */
    private HashMap<Criterion, CriteriaComparison> criteriaComparisonVotes;

    /**
     * The global priority of the criterion in the decision hierarchy.
     */
    private Double globalPriority;

    /**
     * The rating scale associated with this criterion,
     * allowing participants to score alternatives against it.
     */
    private RatingScale ratingScale;

    /**
     * CriterionImpl Constructor.
     */
    public CriterionImpl()
    {
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
     * @return Returns the criteriaComparisonVotes.
     */
    public HashMap<Criterion, CriteriaComparison> getCriteriaComparisonVotes()
    {
        return criteriaComparisonVotes;
    }

    /**
     * @param criteriaComparisonVotes The criteriaComparisonVotes to set.
     */
    public void setCriteriaComparisonVotes(HashMap<Criterion, CriteriaComparison> criteriaComparisonVotes)
    {
        this.criteriaComparisonVotes = criteriaComparisonVotes;
    }

    /**
     * @return Returns the criterionId.
     */
    public Integer getCriterionId()
    {
        return criterionId;
    }

    /**
     * @param criterionId The criterionId to set.
     */
    public void setCriterionId(Integer criterionId)
    {
        this.criterionId = criterionId;
    }

    /**
     * @return Returns the criterionName.
     */
    public String getCriterionName()
    {
        return criterionName;
    }

    /**
     * @param criterionName The criterionName to set.
     */
    public void setCriterionName(String criterionName)
    {
        this.criterionName = criterionName;
    }

    /**
     * @return Returns the globalPriority.
     */
    public Double getGlobalPriority()
    {
        return globalPriority;
    }

    /**
     * @param globalPriority The globalPriority to set.
     */
    public void setGlobalPriority(Double globalPriority)
    {
        this.globalPriority = globalPriority;
    }

    /**
     * @return Returns the ratingScale.
     */
    public RatingScale getRatingScale()
    {
        return ratingScale;
    }

    /**
     * @param ratingScale The ratingScale to set.
     */
    public void setRatingScale(RatingScale ratingScale)
    {
        this.ratingScale = ratingScale;
    }

    /**
     * @return Returns the criterionComments.
     */
    public List<ModelComment> getCriterionComments()
    {
        return criterionComments;
    }

    /**
     * @param criterionComments The criterionComments to set.
     */
    public void setCriterionComments(List<ModelComment> criterionComments)
    {
        this.criterionComments = criterionComments;
    }
}