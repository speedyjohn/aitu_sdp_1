package Task2.NotificationMethods;

import Task2.Interfaces.NotificationInterface;

public class SlackNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message, String userid) {
        System.out.println("Slack message to user " + userid + " has sent.\nText of message:\n" + message);
    }
}
