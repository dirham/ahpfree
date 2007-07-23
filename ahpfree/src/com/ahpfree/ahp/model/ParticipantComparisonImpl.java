/*
 *
 */
package com.ahpfree.ahp.model;


/**
 * A representation of a participant's voting matrix within
 * a particular comparison set in the decision hierarchy.
 */
public class ParticipantComparisonImpl implements ParticipantComparison
{
    /**
     * The matrix of participant votes for this comparison set.
     */
    private Vote[][] voteMatrix;

    /**
     * Participant-specific comments about this comparison set.
     */
    private ModelComment participantComparisonComment;

    /**
     * @return Returns the participantComparisonComment.
     */
    public ModelComment getParticipantComparisonComment()
    {
        return participantComparisonComment;
    }

    /**
     * @param participantComparisonComment The participantComparisonComment to set.
     */
    public void setParticipantComparisonComment(ModelComment participantComparisonComment)
    {
        this.participantComparisonComment = participantComparisonComment;
    }

    /**
     * @return Returns the voteMatrix.
     */
    public Vote[][] getVoteMatrix()
    {
        return voteMatrix;
    }

    /**
     * @param voteMatrix The voteMatrix to set.
     */
    public void setVoteMatrix(Vote[][] voteMatrix)
    {
        this.voteMatrix = voteMatrix;
    }

    /**
     * ParticipantComparisonImpl Constructor.
     */
    public ParticipantComparisonImpl()
    {
    }
}
