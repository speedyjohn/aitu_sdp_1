package Task1;

import Task1.Interfaces.PaymentInterface;

public class PaymentHandler {
    private final PaymentInterface paymentInterface;

    public PaymentHandler(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void handlePayment(double amount) {
        paymentInterface.getPayment(amount);
    }
}
