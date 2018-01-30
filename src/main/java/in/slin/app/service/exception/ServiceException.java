package in.slin.app.service.exception;

import in.slin.app.exception.SlinException;

public class ServiceException extends SlinException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException () {}
	
	public ServiceException (String message, Exception ex) {
		super(message, ex);
	}
}
