/*
 * Copyright 2007 Combined Conditional Access Development, LLC.
 */
package com.ahpfree.ahp.model;

import java.util.List;

import com.ahpfree.ahp.model.interfaces.ModelComment;
import com.ahpfree.ahp.model.interfaces.SiteUser;

/**
 * {@inheritDoc}
 */
public class SiteUserImpl implements SiteUser
{
    /**
     * User website authentication username.
     */
    private String username;

    /**
     * User website authentication password.
     */
    private String password;

    /**
     * User common name.
     */
    private String userCommonName;

    /**
     * User IP Address.
     */
    private String userIpAddress;

    /**
     * User e-mail address.
     */
    private String userEmailAddress;

    /**
     * A user's comment about themselves.
     */
    private ModelComment userComment;

    /**
     * A collection of participant IDs representing this user's participation in decision models.
     */
    private List<Integer> participantIds;

    /**
     * @return Returns the userComment.
     */
    public ModelComment getUserComment()
    {
        return userComment;
    }

    /**
     * @param userComment The userComment to set.
     */
    public void setUserComment(ModelComment userComment)
    {
        this.userComment = userComment;
    }

    /**
     * SiteUserImpl Constructor.
     */
    public SiteUserImpl()
    {
    }

    /**
     * @return Returns the password.
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * @param password The password to set.
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * @return Returns the userCommonName.
     */
    public String getUserCommonName()
    {
        return userCommonName;
    }

    /**
     * @param userCommonName The userCommonName to set.
     */
    public void setUserCommonName(String userCommonName)
    {
        this.userCommonName = userCommonName;
    }

    /**
     * @return Returns the userEmailAddress.
     */
    public String getUserEmailAddress()
    {
        return userEmailAddress;
    }

    /**
     * @param userEmailAddress The userEmailAddress to set.
     */
    public void setUserEmailAddress(String userEmailAddress)
    {
        this.userEmailAddress = userEmailAddress;
    }

    /**
     * @return Returns the userIpAddress.
     */
    public String getUserIpAddress()
    {
        return userIpAddress;
    }

    /**
     * @param userIpAddress The userIpAddress to set.
     */
    public void setUserIpAddress(String userIpAddress)
    {
        this.userIpAddress = userIpAddress;
    }

    /**
     * @return Returns the username.
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * @param username The username to set.
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * @return the participant Ids of this user in models.
     */
	public List<Integer> getParticipantIds() {
		return participantIds;
	}

	/**
	 * @param participantIds of this user in models.
	 */
	public void setParticipantIds(List<Integer> participantIds) {
		this.participantIds = participantIds;
	}
}
