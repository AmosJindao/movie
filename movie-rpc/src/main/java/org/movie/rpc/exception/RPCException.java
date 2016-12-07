package org.movie.rpc.exception;

/**
 * @author shengri.liu
 * @date 2016-12-07
 */
public class RPCException extends RuntimeException {
    public RPCException() {
        super();
    }

    public RPCException(String message) {
        super(message);
    }

    public RPCException(String message, Throwable cause) {
        super(message, cause);
    }

    public RPCException(Throwable cause) {
        super(cause);
    }

    protected RPCException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
