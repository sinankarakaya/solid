package exceptions;

public class FraudDetectedException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 786558493018326520L;

    public FraudDetectedException(String message) {
        super(message);
    }
}
