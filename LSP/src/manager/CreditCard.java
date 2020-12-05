package manager;

import entity.PaymentInstrument;
import exceptions.PaymentInstrumentInvalidException;

public class CreditCard extends PaymentInstrument{

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        super.validate();
        // additional validations for credit cards
    }
}
