package Task2.NotificationMethods;

import Task2.Interfaces.NotificationInterface;

public class EmailNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message, String userid) {
        System.out.println("Email to user " + userid + " has sent.\nText of Email:\n" + message);
    }
}
