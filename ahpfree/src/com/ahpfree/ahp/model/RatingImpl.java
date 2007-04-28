/**
 *
 */
package com.ahpfree.ahp.model;

import com.ahpfree.ahp.model.interfaces.Alternative;
import com.ahpfree.ahp.model.interfaces.Rating;


/**
 * A voter's valuation of an alternative with respect to a criterion in a decision model.
 */
public class RatingImpl extends VoteImpl implements Rating {
    /**
     * The alternative being rated in this vote.
     */
    private Alternative ratingAlternative;

    /**
     * @return Returns the ratingAlternative.
     */
    public Alternative getRatingAlternative()
    {
        return ratingAlternative;
    }

    /**
     * @param ratingAlternative The ratingAlternative to set.
     */
    public void setRatingAlternative(Alternative ratingAlternative)
    {
        this.ratingAlternative = ratingAlternative;
    }

    /**
     * RatingImpl Constructor.
     */
    public RatingImpl()
    {
    }
}