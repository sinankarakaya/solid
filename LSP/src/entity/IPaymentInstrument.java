package entity;

import exceptions.PaymentFailedException;
import exceptions.PaymentInstrumentInvalidException;

public interface IPaymentInstrument {
    void validate() throws PaymentInstrumentInvalidException;
    PaymentResponse collectPayment() throws PaymentFailedException;
}
