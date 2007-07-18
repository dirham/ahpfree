/**
 *
 */
package com.ahpfree.ahp.model;


/**
 *
 */
public abstract class VoteImpl implements Vote {
    /**
     * Unique identifier of this vote instance.
     */
    private Integer voteId;

    /**
     * The dominant criterion in this vote.  All votes must have at least one
     * criterion.  In criteria pairwise comparisons, this criterion will be the
     * dominant node, and the sub-type will define the passive node.  In the case
     * of ratings or pairwise alternatives, this is the "with respect to" criterion.
     */
    private Criterion dominantCriterion;

    /**
     * The participant performing the vote.
     */
    private Participant participant;

    /**
     * The value of the vote cast by the participant.
     */
    private Double voteValue;

    /**
     * A comment about the vote entered by the participant.
     */
    private String voteComment;

    /**
     * VoteImpl Constructor.
     */
    public VoteImpl()
    {
    }

    /**
     * @return Returns the dominantCriterion.
     */
    public Criterion getDominantCriterion()
    {
        return dominantCriterion;
    }

    /**
     * @param dominantCriterion The dominantCriterion to set.
     */
    public void setDominantCriterion(Criterion dominantCriterion)
    {
        this.dominantCriterion = dominantCriterion;
    }

    /**
     * @return Returns the participant.
     */
    public Participant getParticipant()
    {
        return participant;
    }

    /**
     * @param participant The participant to set.
     */
    public void setParticipant(Participant participant)
    {
        this.participant = participant;
    }

    /**
     * @return Returns the voteComment.
     */
    public String getVoteComment()
    {
        return voteComment;
    }

    /**
     * @param voteComment The voteComment to set.
     */
    public void setVoteComment(String voteComment)
    {
        this.voteComment = voteComment;
    }

    /**
     * @return Returns the voteId.
     */
    public Integer getVoteId()
    {
        return voteId;
    }

    /**
     * @param voteId The voteId to set.
     */
    public void setVoteId(Integer voteId)
    {
        this.voteId = voteId;
    }

    /**
     * @return Returns the voteValue.
     */
    public Double getVoteValue()
    {
        return voteValue;
    }

    /**
     * @param voteValue The voteValue to set.
     */
    public void setVoteValue(Double voteValue)
    {
        this.voteValue = voteValue;
    }
}
