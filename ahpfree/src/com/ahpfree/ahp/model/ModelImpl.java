/**
 * Copyright (c) 2007 AHPFree, Inc
 */
package com.ahpfree.ahp.model;

import java.util.List;

import com.ahpfree.ahp.model.interfaces.Alternative;
import com.ahpfree.ahp.model.interfaces.Criterion;
import com.ahpfree.ahp.model.interfaces.Model;
import com.ahpfree.ahp.model.interfaces.ModelComment;
import com.ahpfree.ahp.model.interfaces.Participant;

/**
 * The model is the root class of an AHP decision in the system.
 */
public class ModelImpl implements Model {
    /**
     * Unique identifier of the model.
     */
    private Integer modelId;

    /**
     * Collection of alternatives in the decision model.
     */
    private List<Alternative> alternatives;

    /**
     * Collection of participants voting in the model.
     */
    private List<Participant> participants;

    /**
     * The root node of the decision hierarchy.
     */
    private Criterion goal;

    /**
     * User-defined comments about this model.
     */
    private List<ModelComment> modelComments;

    /**
     * ModelImpl Constructor.
     */
    public ModelImpl()
    {
    }

    /**
     * @return Returns the alternatives.
     */
    public List<Alternative> getAlternatives()
    {
        return alternatives;
    }

    /**
     * @param alternatives The alternatives to set.
     */
    public void setAlternatives(List<Alternative> alternatives)
    {
        this.alternatives = alternatives;
    }

    /**
     * @return Returns the goal.
     */
    public Criterion getGoal()
    {
        return goal;
    }

    /**
     * @param goal The goal to set.
     */
    public void setGoal(Criterion goal)
    {
        this.goal = goal;
    }

    /**
     * @return Returns the participants.
     */
    public List<Participant> getParticipants()
    {
        return participants;
    }

    /**
     * @param participants The participants to set.
     */
    public void setParticipants(List<Participant> participants)
    {
        this.participants = participants;
    }

    /**
     * @return Returns the modelId.
     */
    public Integer getModelId()
    {
        return modelId;
    }

    /**
     * @param modelId The modelId to set.
     */
    public void setModelId(Integer modelId)
    {
        this.modelId = modelId;
    }

    /**
     * @return Returns the modelComments.
     */
    public List<ModelComment> getModelComments()
    {
        return modelComments;
    }

    /**
     * @param modelComments The modelComments to set.
     */
    public void setModelComments(List<ModelComment> modelComments)
    {
        this.modelComments = modelComments;
    }
    
    public static void main(String args[])
    {
        
    }
}
