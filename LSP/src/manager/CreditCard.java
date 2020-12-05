package manager;

import exceptions.PaymentInstrumentInvalidException;

public class CreditCard extends BaseBankCard {
    // constructor omitted
    
    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        basicValidator.validate();
        // additional validations for credit cards
    }
  }