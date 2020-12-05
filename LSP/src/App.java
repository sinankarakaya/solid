import entity.OrderDetails;
import exceptions.IFraudChecker;
import exceptions.IPaymentGatewayHandler;
import manager.CreditCard;
import manager.IPaymentInstrumentValidator;
import manager.PaymentProcessor;
import manager.RewardsCard;

public class App {
    public static void main(String[] args) throws Exception {

      IPaymentGatewayHandler gatewayHandler = 
        new PaymentGatewayHandler(name, cardNum, code, expiryDate);
        
      IPaymentInstrumentValidator validator = 
        new BankCardBasicValidator(name, cardNum, code, expiryDate);
      
      IFraudChecker fraudChecker = 
        new ThirdPartyFraudChecker(name, cardNum, code, expiryDate);
      
      CreditCard card = 
        new CreditCard(
          name,
          cardNum,
          code,
          expiryDate,
          validator,
          fraudChecker,
          gatewayHandler);
      
      PaymentProcessor paymentProcessor = new PaymentProcessor();
      paymentProcessor.process(new OrderDetails(), card);

      RewardsCard rcards = new RewardsCard(name, cardNum);
      paymentProcessor.process(new OrderDetails(), rcards);
      
        System.out.println("Hello, World!");
    }
}
