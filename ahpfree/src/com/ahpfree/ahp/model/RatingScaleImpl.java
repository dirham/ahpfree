/**
 *
 */
package com.ahpfree.ahp.model;

import java.util.List;

/**
 *
 */
public class RatingScaleImpl implements RatingScale {
    /**
     * Unique identifier of the rating scale.
     */
    private Integer ratingScaleId;

    /**
     * A collection of rating scale thresholds that
     * demarcate user-defined voting points in the scale.
     */
    private List<RatingScaleThreshold> ratingScaleThresholds;

    /**
     * A collection of user-attributed comments about the rating scale.
     */
    private List<ModelComment> ratingScaleComments;

    /**
     * RatingScaleImpl Constructor.
     */
    public RatingScaleImpl()
    {
    }

    /**
     * @return Returns the ratingScaleId.
     */
    public Integer getRatingScaleId()
    {
        return ratingScaleId;
    }

    /**
     * @param ratingScaleId The ratingScaleId to set.
     */
    public void setRatingScaleId(Integer ratingScaleId)
    {
        this.ratingScaleId = ratingScaleId;
    }

    /**
     * @return Returns the ratingScaleThresholds.
     */
    public List<RatingScaleThreshold> getRatingScaleThresholds()
    {
        return ratingScaleThresholds;
    }

    /**
     * @param ratingScaleThresholds The ratingScaleThresholds to set.
     */
    public void setRatingScaleThresholds(List<RatingScaleThreshold> ratingScaleThresholds)
    {
        this.ratingScaleThresholds = ratingScaleThresholds;
    }

    /**
     * @return Returns the ratingScaleComments.
     */
    public List<ModelComment> getRatingScaleComments()
    {
        return ratingScaleComments;
    }

    /**
     * @param ratingScaleComments The ratingScaleComments to set.
     */
    public void setRatingScaleComments(List<ModelComment> ratingScaleComments)
    {
        this.ratingScaleComments = ratingScaleComments;
    }
}
