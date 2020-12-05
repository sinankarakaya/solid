package manager;

import exceptions.PaymentFailedException;

class PaymentGatewayHandler implements IPaymentGatewayHandler {
    // members omitted
    
    @Override
    public PaymentGatewayResponse handlePayment() throws PaymentFailedException {

        return new PaymentGatewayResponse();
    }
  }