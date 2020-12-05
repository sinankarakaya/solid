package entity;

import java.util.Date;

import exceptions.FraudDetectedException;
import exceptions.PaymentFailedException;
import exceptions.PaymentInstrumentInvalidException;

public abstract class PaymentInstrument {
    String name;
    String cardNumber;
    String verificationCode;
    Date expiryDate;
    String fingerprint;
  
    public void validate() throws PaymentInstrumentInvalidException {
      if (name == null || name.isEmpty()) {
        throw new PaymentInstrumentInvalidException("Name is invalid");
      }
    }
  
    public void runFraudChecks() throws FraudDetectedException {
      // run checks against a third-party system
    }
  
    public void sendToPaymentGateway() throws PaymentFailedException {
      // send details to payment gateway (PG) and set fingerprint from 
      // the payment gateway response
    }  

    public String getCardNumber() {
      return cardNumber;
    }
    public Date getExpiryDate() {
      return expiryDate;
    }
    public String getFingerprint() {
      return fingerprint;
    }
    public String getName() {
      return name;
    }
    public String getVerificationCode() {
      return verificationCode;
    }
}
