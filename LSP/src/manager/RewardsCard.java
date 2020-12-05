package manager;

import entity.IPaymentInstrument;
import entity.PaymentResponse;
import exceptions.PaymentFailedException;
import exceptions.PaymentInstrumentInvalidException;

public class RewardsCard implements IPaymentInstrument {
    String name;
    String cardNumber;
  
    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        // Rewards card related validations
    }
  
    @Override
    public PaymentResponse collectPayment() throws PaymentFailedException {
        PaymentResponse response = new PaymentResponse();
        // Steps related to rewards card payment like getting current
        // rewards balance, updating balance etc.
        response.setIdentifier(cardNumber);
        return response;
    }
  }
