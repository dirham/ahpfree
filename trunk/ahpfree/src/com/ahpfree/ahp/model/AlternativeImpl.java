/**
 *
 */
package com.ahpfree.ahp.model;

import java.util.HashMap;
import java.util.List;

import com.ahpfree.ahp.model.interfaces.Alternative;
import com.ahpfree.ahp.model.interfaces.Criterion;
import com.ahpfree.ahp.model.interfaces.ModelComment;

/**
 * An alternative represents an item between which participants are trying to decide.
 */
public class AlternativeImpl implements Alternative {
    /**
     * Unique identifier of the alternative.
     */
    private Integer alternativeId;

    /**
     * The name of the alternative.
     */
    private String alternativeName;

    /**
     * The order of the alternative in displayed lists.
     */
    private int alternativeOrder;

    /**
     * The score of the alternative.  The key is the Criterion against which the score is relevant.
     */
    private HashMap<Criterion, Double> alternativeScores;

    /**
     * User-defined comments about this alternative.
     */
    private List<ModelComment> alternativeComments;

    /**
     * AlternativeImpl Constructor.
     */
    public AlternativeImpl()
    {
    }

    /**
     * @return Returns the alternativeName.
     */
    public String getAlternativeName()
    {
        return alternativeName;
    }

    /**
     * @param alternativeName The alternativeName to set.
     */
    public void setAlternativeName(String alternativeName)
    {
        this.alternativeName = alternativeName;
    }

    /**
     * @return Returns the alternativeOrder.
     */
    public int getAlternativeOrder()
    {
        return alternativeOrder;
    }

    /**
     * @param alternativeOrder The alternativeOrder to set.
     */
    public void setAlternativeOrder(int alternativeOrder)
    {
        this.alternativeOrder = alternativeOrder;
    }

    /**
     * @return Returns the alternativeScores.
     */
    public HashMap<Criterion, Double> getAlternativeScores()
    {
        return alternativeScores;
    }

    /**
     * @param alternativeScores The alternativeScores to set.
     */
    public void setAlternativeScores(HashMap<Criterion, Double> alternativeScores)
    {
        this.alternativeScores = alternativeScores;
    }

    /**
     * @return Returns the alternativeId.
     */
    public Integer getAlternativeId()
    {
        return alternativeId;
    }

    /**
     * @param alternativeId The alternativeId to set.
     */
    public void setAlternativeId(Integer alternativeId)
    {
        this.alternativeId = alternativeId;
    }

    /**
     * @return Returns the alternativeComments.
     */
    public List<ModelComment> getAlternativeComments()
    {
        return alternativeComments;
    }

    /**
     * @param alternativeComments The alternativeComments to set.
     */
    public void setAlternativeComments(List<ModelComment> alternativeComments)
    {
        this.alternativeComments = alternativeComments;
    }

}
