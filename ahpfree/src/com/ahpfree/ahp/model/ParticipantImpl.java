/**
 *
 */
package com.ahpfree.ahp.model;

import java.util.HashMap;
import java.util.List;

import com.ahpfree.ahp.model.interfaces.AlternativeComparison;
import com.ahpfree.ahp.model.interfaces.CriteriaComparison;
import com.ahpfree.ahp.model.interfaces.Criterion;
import com.ahpfree.ahp.model.interfaces.ModelComment;
import com.ahpfree.ahp.model.interfaces.Participant;
import com.ahpfree.ahp.model.interfaces.Rating;

/**
 * A participant is an individual voting in the decision model.
 */
public class ParticipantImpl implements Participant {
    /**
     * Unique identifier for the participant.
     */
    private Integer participantId;

    /**
     * Name of the participant.
     */
    private String participantName;

    /**
     * Participant role in the model.
     */
    private ModelRole participantRole;

    /**
     * Participant's priority in the model.  This weighs the participant's
     * votes, as not all voters in a model should necessarily have equal say.
     */
    private Double participantPriority;

    /**
     * A collection of a participant's criteria pairwise comparison votes.
     */
    private HashMap<Criterion, CriteriaComparison> participantCriteriaComparisons;

    /**
     * A collection of a participant's pairwise alternative votes.
     */
    private HashMap<Criterion, AlternativeComparison> particantAlternativeComparisons;

    /**
     * A collection of a participant's rating votes.
     */
    private HashMap<Criterion, Rating> participantRatings;

    /**
     * A colleciton of a participant's comments about themselves.
     */
    private List<ModelComment> participantComment;

    /**
     * ParticipantImpl Constructor.
     */
    public ParticipantImpl()
    {
    }

    /**
     * @return Returns the particantAlternativeComparisons.
     */
    public HashMap<Criterion, AlternativeComparison> getParticantAlternativeComparisons()
    {
        return particantAlternativeComparisons;
    }

    /**
     * @param particantAlternativeComparisons The particantAlternativeComparisons to set.
     */
    public void setParticantAlternativeComparisons(HashMap<Criterion, AlternativeComparison> particantAlternativeComparisons)
    {
        this.particantAlternativeComparisons = particantAlternativeComparisons;
    }

    /**
     * @return Returns the participantCriteriaComparisons.
     */
    public HashMap<Criterion, CriteriaComparison> getParticipantCriteriaComparisons()
    {
        return participantCriteriaComparisons;
    }

    /**
     * @param participantCriteriaComparisons The participantCriteriaComparisons to set.
     */
    public void setParticipantCriteriaComparisons(HashMap<Criterion, CriteriaComparison> participantCriteriaComparisons)
    {
        this.participantCriteriaComparisons = participantCriteriaComparisons;
    }

    /**
     * @return Returns the participantId.
     */
    public Integer getParticipantId()
    {
        return participantId;
    }

    /**
     * @param participantId The participantId to set.
     */
    public void setParticipantId(Integer participantId)
    {
        this.participantId = participantId;
    }

    /**
     * @return Returns the participantPriority.
     */
    public Double getParticipantPriority()
    {
        return participantPriority;
    }

    /**
     * @param participantPriority The participantPriority to set.
     */
    public void setParticipantPriority(Double participantPriority)
    {
        this.participantPriority = participantPriority;
    }

    /**
     * @return Returns the participantRatings.
     */
    public HashMap<Criterion, Rating> getParticipantRatings()
    {
        return participantRatings;
    }

    /**
     * @param participantRatings The participantRatings to set.
     */
    public void setParticipantRatings(HashMap<Criterion, Rating> participantRatings)
    {
        this.participantRatings = participantRatings;
    }

    /**
     * @return Returns the participantComment.
     */
    public List<ModelComment> getParticipantComment()
    {
        return participantComment;
    }

    /**
     * @param participantComment The participantComment to set.
     */
    public void setParticipantComment(List<ModelComment> participantComment)
    {
        this.participantComment = participantComment;
    }

    /**
     * @return Returns the participantName.
     */
    public String getParticipantName()
    {
        return participantName;
    }

    /**
     * @param participantName The participantName to set.
     */
    public void setParticipantName(String participantName)
    {
        this.participantName = participantName;
    }

    /**
     * @return Returns the participantRole.
     */
    public ModelRole getParticipantRole()
    {
        return participantRole;
    }

    /**
     * @param participantRole The participantRole to set.
     */
    public void setParticipantRole(ModelRole participantRole)
    {
        this.participantRole = participantRole;
    }
}
