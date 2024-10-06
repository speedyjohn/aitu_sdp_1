package Task2;

import Task2.Interfaces.NotificationInterface;

public class NotificationHandler {
    private NotificationInterface notificationInterface;

    public NotificationHandler(NotificationInterface notificationInterface) {
        this.notificationInterface = notificationInterface;
    }

    public void sendNotification(String message, String userid) {
        notificationInterface.sendNotification(message, userid);
        System.out.println("");
    }

    public void sendNotifications(String message, String[] userids) {
        for(String userid: userids) {
            sendNotification(message, userid);
            System.out.println("");
        }
    }
}
