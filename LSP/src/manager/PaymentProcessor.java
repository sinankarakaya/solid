package manager;

import entity.IPaymentInstrument;
import entity.OrderDetails;
import entity.PaymentResponse;

public class PaymentProcessor {
    public void process(OrderDetails orderDetails, IPaymentInstrument paymentInstrument) {
      try {
        paymentInstrument.validate();
        PaymentResponse response = paymentInstrument.collectPayment();
        saveToDatabase(orderDetails, response.getIdentifier());
      } catch (Exception e) {
        // exception handling
      }
    }
  
    void saveToDatabase(OrderDetails orderDetails, String identifier) {
      // save the identifier and order details in DB
    }
  }
