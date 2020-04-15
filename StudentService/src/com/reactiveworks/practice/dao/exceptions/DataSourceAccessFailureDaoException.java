package com.reactiveworks.practice.dao.exceptions;

public class DataSourceAccessFailureDaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataSourceAccessFailureDaoException() {
		super();
	}

	public DataSourceAccessFailureDaoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DataSourceAccessFailureDaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataSourceAccessFailureDaoException(String message) {
		super(message);
	}

	public DataSourceAccessFailureDaoException(Throwable cause) {
		super(cause);
	}
	
	

}
