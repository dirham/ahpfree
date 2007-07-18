/**
 *
 */
package com.ahpfree.ahp.model;

import java.util.List;

/**
 * The RatingScaleThreshold is a specific point within the 0 to 1 distribution of a rating scale,
 * allowing participants in the model to say specifically how well an alternative meets a criterion.
 */
public class RatingScaleThresholdImpl implements RatingScaleThreshold
{
    /**
     * Unique identifier of the rating scale threshold instance.
     */
    private Integer ratingScaleThresholdId;

    /**
     * Display name of the rating scale threshold.
     */
    private String ratingScaleThresholdName;

    /**
     * Value of the rating scale threshold.
     */
    private Double ratingScaleThresholdValue;

    /**
     * Collection of user comments about this specific rating scale threshold.
     */
    private List<ModelComment> ratingScaleThresholdComments;

    /**
     * RatingScaleThresholdImpl Constructor.
     */
    public RatingScaleThresholdImpl()
    {
    }

    /**
     * @return Returns the ratingScaleThresholdComments.
     */
    public List<ModelComment> getRatingScaleThresholdComments()
    {
        return ratingScaleThresholdComments;
    }

    /**
     * @param ratingScaleThresholdComments The ratingScaleThresholdComments to set.
     */
    public void setRatingScaleThresholdComments(List<ModelComment> ratingScaleThresholdComments)
    {
        this.ratingScaleThresholdComments = ratingScaleThresholdComments;
    }

    /**
     * @return Returns the ratingScaleThresholdId.
     */
    public Integer getRatingScaleThresholdId()
    {
        return ratingScaleThresholdId;
    }

    /**
     * @param ratingScaleThresholdId The ratingScaleThresholdId to set.
     */
    public void setRatingScaleThresholdId(Integer ratingScaleThresholdId)
    {
        this.ratingScaleThresholdId = ratingScaleThresholdId;
    }

    /**
     * @return Returns the ratingScaleThresholdName.
     */
    public String getRatingScaleThresholdName()
    {
        return ratingScaleThresholdName;
    }

    /**
     * @param ratingScaleThresholdName The ratingScaleThresholdName to set.
     */
    public void setRatingScaleThresholdName(String ratingScaleThresholdName)
    {
        this.ratingScaleThresholdName = ratingScaleThresholdName;
    }

    /**
     * @return Returns the ratingScaleThresholdValue.
     */
    public Double getRatingScaleThresholdValue()
    {
        return ratingScaleThresholdValue;
    }

    /**
     * @param ratingScaleThresholdValue The ratingScaleThresholdValue to set.
     */
    public void setRatingScaleThresholdValue(Double ratingScaleThresholdValue)
    {
        this.ratingScaleThresholdValue = ratingScaleThresholdValue;
    }
}
