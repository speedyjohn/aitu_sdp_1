package Task1.PaymentMethods;

import Task1.Interfaces.PaymentInterface;

public class CreditCardPayment implements PaymentInterface {
    @Override
    public void getPayment(double amount) {
        System.out.println("Credit Card Payment. Amount: " + amount + "$.");
    }
}
