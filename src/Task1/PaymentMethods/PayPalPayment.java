package Task1.PaymentMethods;

import Task1.Interfaces.PaymentInterface;

public class PayPalPayment implements PaymentInterface {
    @Override
    public void getPayment(double amount) {
        System.out.println("PayPal Payment. Amount: " + amount + "$.");
    }
}
