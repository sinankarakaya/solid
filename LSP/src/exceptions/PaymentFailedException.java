package exceptions;

public class PaymentFailedException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = -5141710032027715809L;

    public PaymentFailedException(String message) {
        super(message);
    }
}