package co.com.ac75.intranet.util;


public class ApplicationException extends Exception{

	/**
	 * Allows you to verify that a loaded class and the serialized object are compatible
	 */
	private static final long serialVersionUID = 1L;
	
	public ApplicationException(String message) {
		super(message);
	}	

	
	
}
