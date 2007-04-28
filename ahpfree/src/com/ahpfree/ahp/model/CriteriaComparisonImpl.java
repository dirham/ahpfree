/**
 *
 */
package com.ahpfree.ahp.model;

import com.ahpfree.ahp.model.interfaces.CriteriaComparison;
import com.ahpfree.ahp.model.interfaces.Criterion;

/**
 * A pairwise comparison vote between two criteria in a decision model.
 */
public class CriteriaComparisonImpl extends VoteImpl implements CriteriaComparison {
    /**
     * The passive criterion in the pairwise comparison set.
     */
    private Criterion passiveCriterion;

    /**
     * CriteriaComparisonImpl Constructor.
     */
    public CriteriaComparisonImpl()
    {
    }
}
