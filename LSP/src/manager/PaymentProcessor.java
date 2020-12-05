package manager;

import entity.OrderDetails;
import entity.PaymentInstrument;

class PaymentProcessor {
    void process(OrderDetails orderDetails, PaymentInstrument paymentInstrument) {
      try {
        paymentInstrument.validate();
        paymentInstrument.runFraudChecks();
        paymentInstrument.sendToPaymentGateway();
        saveToDatabase(orderDetails, paymentInstrument);
      } catch (Exception e){
          // exception handling
      }
    }
  
    void saveToDatabase( OrderDetails orderDetails, PaymentInstrument paymentInstrument) {
      String fingerprint = paymentInstrument.getFingerprint();
      // save fingerprint and order details in DB
    }
  }
