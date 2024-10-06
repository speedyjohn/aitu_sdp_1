package Task2.NotificationMethods;

import Task2.Interfaces.NotificationInterface;

public class SMSNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message, String userid) {
        System.out.println("SMS to user " + userid + " has sent.\nText of SMS:\n" + message);
    }
}
