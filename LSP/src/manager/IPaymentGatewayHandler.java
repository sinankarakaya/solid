package manager;

import exceptions.PaymentFailedException;

interface IPaymentGatewayHandler {
    PaymentGatewayResponse handlePayment() throws PaymentFailedException;
}
