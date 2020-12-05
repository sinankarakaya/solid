package exceptions;

public class PaymentInstrumentInvalidException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = -7981404236616341777L;

    public PaymentInstrumentInvalidException(String message) {
        super(message);
    }
}