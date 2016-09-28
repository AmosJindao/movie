package org.ds.exception;

/**
 * @author amos
 * @date Sep 16, 2016
 * @version V0.1
 */
public class StackEmptyException extends RuntimeException{

	private static final long serialVersionUID = 8672437450242794619L;
	
	public StackEmptyException() {
        super();
    }

    public StackEmptyException(String message) {
        super(message);
    }

    public StackEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public StackEmptyException(Throwable cause) {
        super(cause);
    }

    protected StackEmptyException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
