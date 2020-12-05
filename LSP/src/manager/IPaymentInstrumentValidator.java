package manager;

import exceptions.PaymentInstrumentInvalidException;

public interface IPaymentInstrumentValidator {
    void validate() throws PaymentInstrumentInvalidException;
}
