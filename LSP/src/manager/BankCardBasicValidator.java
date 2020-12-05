package manager;

import exceptions.PaymentInstrumentInvalidException;

class BankCardBasicValidator implements IPaymentInstrumentValidator {
    // members like name, cardNumber etc. omitted
  
    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        // basic validation on name, expiryDate etc.
        if (true) {
            throw new PaymentInstrumentInvalidException("Name is invalid");
        }
        // other basic validations
    }
  }
