/*
 *
 */
package com.ahpfree.ahp.model;


/**
 * A representation of a participant's voting matrix within
 * a particular comparison set in the decision hierarchy.
 */
public class ParticipantComparisonSetImpl implements ParticipantComparisonSet
{
    /**
     * The matrix of participant votes for this comparison set.
     */
    private Vote[][] voteMatrix;

    /**
     * Participant-specific comments about this comparison set.
     */
    private ModelComment participantComparisonSetComment;

    /**
     * @return Returns the participantComparisonSetComment.
     */
    public ModelComment getParticipantComparisonSetComment()
    {
        return participantComparisonSetComment;
    }

    /**
     * @param participantComparisonSetComment The participantComparisonSetComment to set.
     */
    public void setParticipantComparisonSetComment(ModelComment participantComparisonSetComment)
    {
        this.participantComparisonSetComment = participantComparisonSetComment;
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
     * ParticipantComparisonSetImpl Constructor.
     */
    public ParticipantComparisonSetImpl()
    {
    }
}
