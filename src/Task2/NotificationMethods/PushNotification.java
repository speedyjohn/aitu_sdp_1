package Task2.NotificationMethods;

import Task2.Interfaces.NotificationInterface;

public class PushNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message, String userid) {
        System.out.println("Push notification to user " + userid + " has sent.\nText of notification:\n" + message);
    }
}
