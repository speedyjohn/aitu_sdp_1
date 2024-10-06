import Task1.Interfaces.PaymentInterface;
import Task1.PaymentHandler;
import Task1.PaymentMethods.BankTransferPayment;
import Task1.PaymentMethods.CreditCardPayment;
import Task1.PaymentMethods.PayPalPayment;
import Task2.NotificationHandler;
import Task2.NotificationMethods.EmailNotification;
import Task2.NotificationMethods.PushNotification;
import Task2.NotificationMethods.SMSNotification;
import Task2.NotificationMethods.SlackNotification;

public class Main {
    public static void main(String[] args) {
        paymentTest();
        notificationTest();

    }

    static void paymentTest() {
        PaymentInterface paypal = new PayPalPayment();
        PaymentInterface creditCard = new CreditCardPayment();
        PaymentInterface bankTransfer = new BankTransferPayment();

        PaymentHandler paypalHandler = new PaymentHandler(paypal);
        PaymentHandler creditCardHandler = new PaymentHandler(creditCard);
        PaymentHandler bankTransferHandler = new PaymentHandler(bankTransfer);

        paypalHandler.handlePayment(123.456);
        creditCardHandler.handlePayment(228.1337);
        bankTransferHandler.handlePayment(1000000);
    }

    static void notificationTest() {
        EmailNotification emailNotification = new EmailNotification();
        PushNotification pushNotification = new PushNotification();
        SlackNotification slackNotification = new SlackNotification();
        SMSNotification smsNotification = new SMSNotification();

        NotificationHandler emailNotificationHandler = new NotificationHandler(emailNotification);
        NotificationHandler pushNotificationHandler = new NotificationHandler(pushNotification);
        NotificationHandler slackNotificationHandler = new NotificationHandler(slackNotification);
        NotificationHandler smsNotificationHandler = new NotificationHandler(smsNotification);

        emailNotificationHandler.sendNotification("Hello bro from Email!", "230870");
        pushNotificationHandler.sendNotification("Hello bro from Push!", "223123");
        slackNotificationHandler.sendNotification("Hello bro from Slack!", "233221");
        smsNotificationHandler.sendNotification("Hello bro from SMS!", "532223");

        emailNotificationHandler.sendNotifications("Bulk Hello from Email!", new String[] {"123456", "234567", "345678"});
        pushNotificationHandler.sendNotifications("Bulk Hello from Push!", new String[] {"456789", "567890", "678901"});
        slackNotificationHandler.sendNotifications("Bulk Hello from Slack!", new String[] {"789012", "890123", "901234"});
        smsNotificationHandler.sendNotifications("Bulk Hello from SMS!", new String[] {"098765", "987654", "876543"});
    }
}