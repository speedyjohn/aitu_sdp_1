package Task1.PaymentMethods;

import Task1.Interfaces.PaymentInterface;

public class BankTransferPayment implements PaymentInterface {
    @Override
    public void getPayment(double amount) {
        System.out.println("Bank Transfer Payment. Amount: " + amount + "$.");
    }
}
