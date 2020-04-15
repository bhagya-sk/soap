
package com.reactiveworks.student.repository;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.12
 * 2020-03-19T15:02:32.618-07:00
 * Generated source version: 3.2.12
 */

@WebFault(name = "DaoOperationFailureException", targetNamespace = "http://repository.student.reactiveworks.com/")
public class DaoOperationFailureException_Exception extends Exception {

    private com.reactiveworks.student.repository.DaoOperationFailureException daoOperationFailureException;

    public DaoOperationFailureException_Exception() {
        super();
    }

    public DaoOperationFailureException_Exception(String message) {
        super(message);
    }

    public DaoOperationFailureException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DaoOperationFailureException_Exception(String message, com.reactiveworks.student.repository.DaoOperationFailureException daoOperationFailureException) {
        super(message);
        this.daoOperationFailureException = daoOperationFailureException;
    }

    public DaoOperationFailureException_Exception(String message, com.reactiveworks.student.repository.DaoOperationFailureException daoOperationFailureException, java.lang.Throwable cause) {
        super(message, cause);
        this.daoOperationFailureException = daoOperationFailureException;
    }

    public com.reactiveworks.student.repository.DaoOperationFailureException getFaultInfo() {
        return this.daoOperationFailureException;
    }
}