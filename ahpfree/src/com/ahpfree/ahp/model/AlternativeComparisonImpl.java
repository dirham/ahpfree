/**
 *
 */
package com.ahpfree.ahp.model;


/**
 * A pairwise comparison of two alternatives with
 * respect to a criterion in the decision model.
 */
public class AlternativeComparisonImpl extends VoteImpl implements AlternativeComparison {
    /**
     * The dominant alternative in the comparison.  Dominant means
     * that this alternative is the first in the question, "Which
     * alternative better meets criterion 'a': (dominant alternative)
     * or (passive alternative)?"
     */
    private Alternative dominantAlternative;

    /**
     * The passive alternative in the comparison.
     */
    private Alternative passiveAlternative;

    /*
     * AlternativeComparisonImpl Constructor.
     */
    public AlternativeComparisonImpl()
    {
    }

    /**
     * @return Returns the dominantAlternative.
     */
    public Alternative getDominantAlternative()
    {
        return dominantAlternative;
    }

    /**
     * @param dominantAlternative The dominantAlternative to set.
     */
    public void setDominantAlternative(Alternative dominantAlternative)
    {
        this.dominantAlternative = dominantAlternative;
    }

    /**
     * @return Returns the passiveAlternative.
     */
    public Alternative getPassiveAlternative()
    {
        return passiveAlternative;
    }

    /**
     * @param passiveAlternative The passiveAlternative to set.
     */
    public void setPassiveAlternative(Alternative passiveAlternative)
    {
        this.passiveAlternative = passiveAlternative;
    }
}