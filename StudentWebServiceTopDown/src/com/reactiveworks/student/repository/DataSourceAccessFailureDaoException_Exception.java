
package com.reactiveworks.student.repository;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.12
 * 2020-03-19T15:02:32.647-07:00
 * Generated source version: 3.2.12
 */

@WebFault(name = "DataSourceAccessFailureDaoException", targetNamespace = "http://repository.student.reactiveworks.com/")
public class DataSourceAccessFailureDaoException_Exception extends Exception {

    private com.reactiveworks.student.repository.DataSourceAccessFailureDaoException dataSourceAccessFailureDaoException;

    public DataSourceAccessFailureDaoException_Exception() {
        super();
    }

    public DataSourceAccessFailureDaoException_Exception(String message) {
        super(message);
    }

    public DataSourceAccessFailureDaoException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DataSourceAccessFailureDaoException_Exception(String message, com.reactiveworks.student.repository.DataSourceAccessFailureDaoException dataSourceAccessFailureDaoException) {
        super(message);
        this.dataSourceAccessFailureDaoException = dataSourceAccessFailureDaoException;
    }

    public DataSourceAccessFailureDaoException_Exception(String message, com.reactiveworks.student.repository.DataSourceAccessFailureDaoException dataSourceAccessFailureDaoException, java.lang.Throwable cause) {
        super(message, cause);
        this.dataSourceAccessFailureDaoException = dataSourceAccessFailureDaoException;
    }

    public com.reactiveworks.student.repository.DataSourceAccessFailureDaoException getFaultInfo() {
        return this.dataSourceAccessFailureDaoException;
    }
}