/**
 *
 */
package com.ahpfree.ahp.model;

import com.ahpfree.ahp.model.interfaces.CriteriaComparison;
import com.ahpfree.ahp.model.interfaces.Criterion;

/**
 * {@inheritDoc}
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

    /**
     * @return the passive criterion in the comparison set.
     */
	public Criterion getPassiveCriterion() {
		return passiveCriterion;
	}

	/**
	 * @param passiveCriterion in the comparison set.
	 */
	public void setPassiveCriterion(Criterion passiveCriterion) {
		this.passiveCriterion = passiveCriterion;
	}
}
