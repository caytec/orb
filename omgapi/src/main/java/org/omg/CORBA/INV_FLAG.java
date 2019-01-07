/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.omg.CORBA;

/**
 * Exception thrown
 * when an invalid flag was passed to an operation (for example, when 
 * creating a DII request).<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../guide/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @version     1.16, 09/09/97
 * @since       JDK1.2
 */

public final class INV_FLAG extends SystemException {
    /**
     * Constructs an <code>INV_FLAG</code> exception with a default 
     * minor code of 0 and a completion state of COMPLETED_NO.
     */
    public INV_FLAG() {
        this("");
    }

    /**
     * Constructs an <code>INV_FLAG</code> exception with the specified detail
     * message, a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
    public INV_FLAG(String s) {
        this(s, 0, CompletionStatus.COMPLETED_NO);
    }

    /**
     * Constructs an <code>INV_FLAG</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed an instance of <code>CompletionStatus</code>
     *                  indicating the completion status
     */
    public INV_FLAG(int minor, CompletionStatus completed) {
        this("", minor, completed);
    }

    /**
     * Constructs an <code>INV_FLAG</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed an instance of <code>CompletionStatus</code>
     *                  indicating the completion status
     */
    public INV_FLAG(String s, int minor, CompletionStatus completed) {
        super(s, minor, completed);
    }
}