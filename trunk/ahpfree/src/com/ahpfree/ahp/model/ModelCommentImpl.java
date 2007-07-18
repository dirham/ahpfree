/*
 * Copyright 2007 Combined Conditional Access Development, LLC.
 */
package com.ahpfree.ahp.model;

import java.util.Date;

/**
 *
 */
public class ModelCommentImpl implements ModelComment
{
    /**
     * Unique identifier of this comment instance.
     */
    private Integer commentId;

    /**
     * The participant making the comment.
     */
    private Participant commentingParticipant;

    /**
     * The text of the comment.
     */
    private String commentText;

    /**
     * The date stamp of the comment.
     */
    private Date commentDate;

    /**
     * ModelCommentImpl Constructor.
     */
    public ModelCommentImpl()
    {
    }

    /**
     * @return Returns the commentDate.
     */
    public Date getCommentDate()
    {
        return commentDate;
    }

    /**
     * @param commentDate The commentDate to set.
     */
    public void setCommentDate(Date commentDate)
    {
        this.commentDate = commentDate;
    }

    /**
     * @return Returns the commentId.
     */
    public Integer getCommentId()
    {
        return commentId;
    }

    /**
     * @param commentId The commentId to set.
     */
    public void setCommentId(Integer commentId)
    {
        this.commentId = commentId;
    }

    /**
     * @return Returns the commentingParticipant.
     */
    public Participant getCommentingParticipant()
    {
        return commentingParticipant;
    }

    /**
     * @param commentingParticipant The commentingParticipant to set.
     */
    public void setCommentingParticipant(Participant commentingParticipant)
    {
        this.commentingParticipant = commentingParticipant;
    }

    /**
     * @return Returns the commentText.
     */
    public String getCommentText()
    {
        return commentText;
    }

    /**
     * @param commentText The commentText to set.
     */
    public void setCommentText(String commentText)
    {
        this.commentText = commentText;
    }
}
