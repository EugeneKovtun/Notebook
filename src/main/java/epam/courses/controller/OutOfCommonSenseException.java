package epam.courses.controller;

/**
 * Created by eugene on 01.08.17.
 */
public class OutOfCommonSenseException extends IllegalArgumentException {
    public OutOfCommonSenseException() {
        super();
    }

    public OutOfCommonSenseException(String s) {
        super(s);
    }

    public OutOfCommonSenseException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfCommonSenseException(Throwable cause) {
        super(cause);
    }
}
