/*
 * Copyright 2007 AHPFree, Inc.
 */
package com.ahpfree.ahp.model;


/**
 * Enumeration of the valid user roles within an AHPFree model.
 */
public enum ModelRole
{
    /**
     * User with administrative rights within the model.
     */
    MODEL_BUILDER,

    /**
     * User with voting rights within the model.
     */
    MODEL_VOTER,

    /**
     * User with viewing rights within the model.
     */
    MODEL_VIEWER;
}
