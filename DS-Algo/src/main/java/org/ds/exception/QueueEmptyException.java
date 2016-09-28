package org.ds.exception;

/**
 * @author amos
 * @date Sep 16, 2016
 * @version V0.1
 */
public class QueueEmptyException extends RuntimeException{

	private static final long serialVersionUID = 8672437450242794619L;
	
	public QueueEmptyException() {
        super();
    }

    public QueueEmptyException(String message) {
        super(message);
    }

    public QueueEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueueEmptyException(Throwable cause) {
        super(cause);
    }

    protected QueueEmptyException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
