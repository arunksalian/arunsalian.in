package in.slin.app.exception;

public class SlinException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SlinException () {}
	
	public SlinException (String message, Exception ex) {
		super(message, ex);
	}
}
